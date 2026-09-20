package io.ably.lib.types;

import io.ably.lib.rest.Auth;
import java.util.Map;
import p204p.ejq;
import p204p.lpa0;
import p204p.w651;

/* JADX INFO: loaded from: classes16.dex */
public class ClientOptions extends Auth.AuthOptions {
    public boolean addRequestIds;
    public Map<String, String> agents;
    public int asyncHttpThreadpoolSize;
    public boolean autoConnect;
    public int channelRetryTimeout;
    public String clientId;
    public Auth.TokenParams defaultTokenParams;
    public long disconnectedRetryTimeout;
    public boolean echoMessages;
    public String environment;
    public String[] fallbackHosts;

    @Deprecated
    public boolean fallbackHostsUseDefault;
    public long fallbackRetryTimeout;
    public Map<String, String> headers;
    public int httpMaxRetryCount;
    public int httpMaxRetryDuration;
    public int httpOpenTimeout;
    public int httpRequestTimeout;
    public boolean idempotentRestPublishing;
    public w651 localStorage;
    public lpa0 logHandler;
    public int logLevel;
    public int port;
    public ProxyOptions proxy;
    public boolean pushFullWait;
    public boolean queueMessages;
    public String realtimeHost;
    public long realtimeRequestTimeout;
    public String recover;
    public String restHost;
    public long suspendedRetryTimeout;
    public boolean tls;
    public int tlsPort;
    public Param[] transportParams;
    public boolean useBinaryProtocol;

    public ClientOptions() {
        this.tls = true;
        this.autoConnect = true;
        this.useBinaryProtocol = true;
        this.queueMessages = true;
        this.echoMessages = true;
        this.idempotentRestPublishing = true;
        String[] strArr = ejq.f60272a;
        this.httpOpenTimeout = 4000;
        this.httpRequestTimeout = 10000;
        this.httpMaxRetryDuration = 15000;
        this.httpMaxRetryCount = 3;
        this.realtimeRequestTimeout = 10000L;
        this.disconnectedRetryTimeout = 15000;
        this.suspendedRetryTimeout = 30000L;
        this.fallbackRetryTimeout = 600000L;
        this.defaultTokenParams = new Auth.TokenParams();
        this.channelRetryTimeout = 15000;
        this.asyncHttpThreadpoolSize = 64;
        this.pushFullWait = false;
        this.addRequestIds = false;
    }

    public void clearAuthOptions() {
        this.key = null;
        this.token = null;
        this.tokenDetails = null;
        this.authHeaders = null;
        this.authParams = null;
        this.queryTime = false;
        this.useTokenAuth = false;
    }

    public ClientOptions copy() {
        ClientOptions clientOptions = new ClientOptions();
        clientOptions.clientId = this.clientId;
        clientOptions.logLevel = this.logLevel;
        clientOptions.logHandler = this.logHandler;
        clientOptions.tls = this.tls;
        clientOptions.restHost = this.restHost;
        clientOptions.realtimeHost = this.realtimeHost;
        clientOptions.port = this.port;
        clientOptions.tlsPort = this.tlsPort;
        clientOptions.autoConnect = this.autoConnect;
        clientOptions.useBinaryProtocol = this.useBinaryProtocol;
        clientOptions.queueMessages = this.queueMessages;
        clientOptions.echoMessages = this.echoMessages;
        clientOptions.recover = this.recover;
        clientOptions.proxy = this.proxy;
        clientOptions.environment = this.environment;
        clientOptions.idempotentRestPublishing = this.idempotentRestPublishing;
        clientOptions.httpOpenTimeout = this.httpOpenTimeout;
        clientOptions.httpRequestTimeout = this.httpRequestTimeout;
        clientOptions.httpMaxRetryDuration = this.httpMaxRetryDuration;
        clientOptions.httpMaxRetryCount = this.httpMaxRetryCount;
        clientOptions.realtimeRequestTimeout = this.realtimeRequestTimeout;
        clientOptions.disconnectedRetryTimeout = this.disconnectedRetryTimeout;
        clientOptions.suspendedRetryTimeout = this.suspendedRetryTimeout;
        clientOptions.fallbackHostsUseDefault = this.fallbackHostsUseDefault;
        clientOptions.fallbackRetryTimeout = this.fallbackRetryTimeout;
        clientOptions.defaultTokenParams = this.defaultTokenParams;
        clientOptions.channelRetryTimeout = this.channelRetryTimeout;
        clientOptions.asyncHttpThreadpoolSize = this.asyncHttpThreadpoolSize;
        clientOptions.pushFullWait = this.pushFullWait;
        clientOptions.addRequestIds = this.addRequestIds;
        clientOptions.authCallback = this.authCallback;
        clientOptions.authUrl = this.authUrl;
        clientOptions.authMethod = this.authMethod;
        clientOptions.key = this.key;
        clientOptions.token = this.token;
        clientOptions.tokenDetails = this.tokenDetails;
        clientOptions.authHeaders = this.authHeaders;
        clientOptions.authParams = this.authParams;
        clientOptions.queryTime = this.queryTime;
        clientOptions.useTokenAuth = this.useTokenAuth;
        return clientOptions;
    }

    public ClientOptions(String str) {
        super(str);
        this.tls = true;
        this.autoConnect = true;
        this.useBinaryProtocol = true;
        this.queueMessages = true;
        this.echoMessages = true;
        this.idempotentRestPublishing = true;
        String[] strArr = ejq.f60272a;
        this.httpOpenTimeout = 4000;
        this.httpRequestTimeout = 10000;
        this.httpMaxRetryDuration = 15000;
        this.httpMaxRetryCount = 3;
        this.realtimeRequestTimeout = 10000L;
        this.disconnectedRetryTimeout = 15000;
        this.suspendedRetryTimeout = 30000L;
        this.fallbackRetryTimeout = 600000L;
        this.defaultTokenParams = new Auth.TokenParams();
        this.channelRetryTimeout = 15000;
        this.asyncHttpThreadpoolSize = 64;
        this.pushFullWait = false;
        this.addRequestIds = false;
        this.logLevel = 5;
    }
}
