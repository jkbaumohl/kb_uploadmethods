package us.kbase.kbuploadmethods;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import us.kbase.auth.AuthToken;
import us.kbase.common.service.JsonClientCaller;
import us.kbase.common.service.JsonClientException;
import us.kbase.common.service.RpcContext;
import us.kbase.common.service.UnauthorizedException;

/**
 * <p>Original spec-file module name: kb_uploadmethods</p>
 * <pre>
 * A KBase module: kb_uploadmethods
 * </pre>
 */
public class KbUploadmethodsClient {
    private JsonClientCaller caller;
    private String serviceVersion = null;


    /** Constructs a client with a custom URL and no user credentials.
     * @param url the URL of the service.
     */
    public KbUploadmethodsClient(URL url) {
        caller = new JsonClientCaller(url);
    }
    /** Constructs a client with a custom URL.
     * @param url the URL of the service.
     * @param token the user's authorization token.
     * @throws UnauthorizedException if the token is not valid.
     * @throws IOException if an IOException occurs when checking the token's
     * validity.
     */
    public KbUploadmethodsClient(URL url, AuthToken token) throws UnauthorizedException, IOException {
        caller = new JsonClientCaller(url, token);
    }

    /** Constructs a client with a custom URL.
     * @param url the URL of the service.
     * @param user the user name.
     * @param password the password for the user name.
     * @throws UnauthorizedException if the credentials are not valid.
     * @throws IOException if an IOException occurs when checking the user's
     * credentials.
     */
    public KbUploadmethodsClient(URL url, String user, String password) throws UnauthorizedException, IOException {
        caller = new JsonClientCaller(url, user, password);
    }

    /** Constructs a client with a custom URL
     * and a custom authorization service URL.
     * @param url the URL of the service.
     * @param user the user name.
     * @param password the password for the user name.
     * @param auth the URL of the authorization server.
     * @throws UnauthorizedException if the credentials are not valid.
     * @throws IOException if an IOException occurs when checking the user's
     * credentials.
     */
    public KbUploadmethodsClient(URL url, String user, String password, URL auth) throws UnauthorizedException, IOException {
        caller = new JsonClientCaller(url, user, password, auth);
    }

    /** Get the token this client uses to communicate with the server.
     * @return the authorization token.
     */
    public AuthToken getToken() {
        return caller.getToken();
    }

    /** Get the URL of the service with which this client communicates.
     * @return the service URL.
     */
    public URL getURL() {
        return caller.getURL();
    }

    /** Set the timeout between establishing a connection to a server and
     * receiving a response. A value of zero or null implies no timeout.
     * @param milliseconds the milliseconds to wait before timing out when
     * attempting to read from a server.
     */
    public void setConnectionReadTimeOut(Integer milliseconds) {
        this.caller.setConnectionReadTimeOut(milliseconds);
    }

    /** Check if this client allows insecure http (vs https) connections.
     * @return true if insecure connections are allowed.
     */
    public boolean isInsecureHttpConnectionAllowed() {
        return caller.isInsecureHttpConnectionAllowed();
    }

    /** Deprecated. Use isInsecureHttpConnectionAllowed().
     * @deprecated
     */
    public boolean isAuthAllowedForHttp() {
        return caller.isAuthAllowedForHttp();
    }

    /** Set whether insecure http (vs https) connections should be allowed by
     * this client.
     * @param allowed true to allow insecure connections. Default false
     */
    public void setIsInsecureHttpConnectionAllowed(boolean allowed) {
        caller.setInsecureHttpConnectionAllowed(allowed);
    }

    /** Deprecated. Use setIsInsecureHttpConnectionAllowed().
     * @deprecated
     */
    public void setAuthAllowedForHttp(boolean isAuthAllowedForHttp) {
        caller.setAuthAllowedForHttp(isAuthAllowedForHttp);
    }

    /** Set whether all SSL certificates, including self-signed certificates,
     * should be trusted.
     * @param trustAll true to trust all certificates. Default false.
     */
    public void setAllSSLCertificatesTrusted(final boolean trustAll) {
        caller.setAllSSLCertificatesTrusted(trustAll);
    }
    
    /** Check if this client trusts all SSL certificates, including
     * self-signed certificates.
     * @return true if all certificates are trusted.
     */
    public boolean isAllSSLCertificatesTrusted() {
        return caller.isAllSSLCertificatesTrusted();
    }
    /** Sets streaming mode on. In this case, the data will be streamed to
     * the server in chunks as it is read from disk rather than buffered in
     * memory. Many servers are not compatible with this feature.
     * @param streamRequest true to set streaming mode on, false otherwise.
     */
    public void setStreamingModeOn(boolean streamRequest) {
        caller.setStreamingModeOn(streamRequest);
    }

    /** Returns true if streaming mode is on.
     * @return true if streaming mode is on.
     */
    public boolean isStreamingModeOn() {
        return caller.isStreamingModeOn();
    }

    public void _setFileForNextRpcResponse(File f) {
        caller.setFileForNextRpcResponse(f);
    }

    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public void setServiceVersion(String newValue) {
        this.serviceVersion = newValue;
    }

    /**
     * <p>Original spec-file function name: upload_fastq_file</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.UploadMethodParams UploadMethodParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult uploadFastqFile(UploadMethodParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.upload_fastq_file", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: upload_fasta_gff_file</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.UploadFastaGFFMethodParams UploadFastaGFFMethodParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadFastaGFFMethodResult UploadFastaGFFMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadFastaGFFMethodResult uploadFastaGffFile(UploadFastaGFFMethodParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadFastaGFFMethodResult>> retType = new TypeReference<List<UploadFastaGFFMethodResult>>() {};
        List<UploadFastaGFFMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.upload_fasta_gff_file", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: unpack_staging_file</p>
     * <pre>
     * Unpack a staging area file
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.UnpackStagingFileParams UnpackStagingFileParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UnpackStagingFileOutput UnpackStagingFileOutput}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UnpackStagingFileOutput unpackStagingFile(UnpackStagingFileParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UnpackStagingFileOutput>> retType = new TypeReference<List<UnpackStagingFileOutput>>() {};
        List<UnpackStagingFileOutput> res = caller.jsonrpcCall("kb_uploadmethods.unpack_staging_file", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: unpack_web_file</p>
     * <pre>
     * Download and unpack a web file to staging area
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.UnpackWebFileParams UnpackWebFileParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UnpackWebFileOutput UnpackWebFileOutput}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UnpackWebFileOutput unpackWebFile(UnpackWebFileParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UnpackWebFileOutput>> retType = new TypeReference<List<UnpackWebFileOutput>>() {};
        List<UnpackWebFileOutput> res = caller.jsonrpcCall("kb_uploadmethods.unpack_web_file", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_genbank_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.GenbankToGenomeParams GenbankToGenomeParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.GenomeSaveResult GenomeSaveResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public GenomeSaveResult importGenbankFromStaging(GenbankToGenomeParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<GenomeSaveResult>> retType = new TypeReference<List<GenomeSaveResult>>() {};
        List<GenomeSaveResult> res = caller.jsonrpcCall("kb_uploadmethods.import_genbank_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_sra_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.SRAToReadsParams SRAToReadsParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importSraFromStaging(SRAToReadsParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_sra_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_sra_from_web</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.WebSRAToReadsParams WebSRAToReadsParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.WebSRAToReadsResult WebSRAToReadsResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public WebSRAToReadsResult importSraFromWeb(WebSRAToReadsParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<WebSRAToReadsResult>> retType = new TypeReference<List<WebSRAToReadsResult>>() {};
        List<WebSRAToReadsResult> res = caller.jsonrpcCall("kb_uploadmethods.import_sra_from_web", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_fasta_as_assembly_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FastaToAssemblyParams FastaToAssemblyParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importFastaAsAssemblyFromStaging(FastaToAssemblyParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_fasta_as_assembly_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_tsv_as_media_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToMediaParams FileToMediaParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importTsvAsMediaFromStaging(FileToMediaParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_tsv_as_media_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_excel_as_media_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToMediaParams FileToMediaParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importExcelAsMediaFromStaging(FileToMediaParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_excel_as_media_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_tsv_or_excel_as_media_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToMediaParams FileToMediaParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importTsvOrExcelAsMediaFromStaging(FileToMediaParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_tsv_or_excel_as_media_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_file_as_fba_model_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToFBAModelParams FileToFBAModelParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importFileAsFbaModelFromStaging(FileToFBAModelParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_file_as_fba_model_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_tsv_as_expression_matrix_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToMatrixParams FileToMatrixParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importTsvAsExpressionMatrixFromStaging(FileToMatrixParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_tsv_as_expression_matrix_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_reads_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.UploadReadsParams UploadReadsParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importReadsFromStaging(UploadReadsParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_reads_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    /**
     * <p>Original spec-file function name: import_tsv_as_phenotype_set_from_staging</p>
     * <pre>
     * </pre>
     * @param   params   instance of type {@link us.kbase.kbuploadmethods.FileToPhenotypeSetParams FileToPhenotypeSetParams}
     * @return   parameter "returnVal" of type {@link us.kbase.kbuploadmethods.UploadMethodResult UploadMethodResult}
     * @throws IOException if an IO exception occurs
     * @throws JsonClientException if a JSON RPC exception occurs
     */
    public UploadMethodResult importTsvAsPhenotypeSetFromStaging(FileToPhenotypeSetParams params, RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        args.add(params);
        TypeReference<List<UploadMethodResult>> retType = new TypeReference<List<UploadMethodResult>>() {};
        List<UploadMethodResult> res = caller.jsonrpcCall("kb_uploadmethods.import_tsv_as_phenotype_set_from_staging", args, retType, true, true, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }

    public Map<String, Object> status(RpcContext... jsonRpcContext) throws IOException, JsonClientException {
        List<Object> args = new ArrayList<Object>();
        TypeReference<List<Map<String, Object>>> retType = new TypeReference<List<Map<String, Object>>>() {};
        List<Map<String, Object>> res = caller.jsonrpcCall("kb_uploadmethods.status", args, retType, true, false, jsonRpcContext, this.serviceVersion);
        return res.get(0);
    }
}
