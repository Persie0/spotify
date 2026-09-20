package com.spotify.decipher.transport;

import androidx.annotation.Keep;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p204p.auw0;
import p204p.gd5;
import p204p.ie41;
import p204p.je41;
import p204p.osr;
import p204p.w8b;
import p204p.y4l0;
import p204p.y8b;
import p204p.z4l0;
import p204p.ztw0;
import p204p.zuu0;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m24211d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u001e\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J1\u0010\"\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b0\u000b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010&\u001a\u00020\u0010H\u0000¢\u0006\u0004\b%\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m24212d2 = {"Lcom/spotify/decipher/transport/DecipherSseTransport;", "", "Lp/w8b;", "callFactory", "<init>", "(Lp/w8b;)V", "Lp/ie41;", "spotifyOkHttp", "(Lp/ie41;)V", "", "url", "", "headers", "Lp/ztw0;", "createRequestBuilder", "(Ljava/lang/String;[[Ljava/lang/String;)Lp/ztw0;", "Lp/w2a1;", "nativeInstall", "()V", "nativeUninstall", "", "nativePtr", "nativeOnConnected", "(J)V", "", "data", "", "length", "nativeOnData", "(J[BI)V", "nativeOnDisconnected", "nativeOnError", "attachToCore", "detachFromCore", "connect", "(JLjava/lang/String;[[Ljava/lang/String;)V", "disconnect", "stopConnections$src_main_java_com_spotify_decipher_transport_transport", "stopConnections", "Lp/w8b;", "Lp/y8b;", "call", "Lp/y8b;", "", "acceptsConnections", "Z", "src_main_java_com_spotify_decipher_transport-transport"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DecipherSseTransport {
    private boolean acceptsConnections;
    private y8b call;
    private final w8b callFactory;

    public DecipherSseTransport(w8b w8bVar) {
        this.callFactory = w8bVar;
        this.acceptsConnections = true;
    }

    private final ztw0 createRequestBuilder(String url, String[][] headers) {
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g(url);
        for (String[] strArr : headers) {
            if (strArr.length == 2) {
                ztw0Var.m96950c(strArr[0], strArr[1]);
            }
        }
        return ztw0Var;
    }

    private final native void nativeInstall();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnConnected(long nativePtr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnData(long nativePtr, byte[] data, int length);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnDisconnected(long nativePtr);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeOnError(long nativePtr);

    private final native void nativeUninstall();

    public final synchronized void attachToCore() {
        nativeInstall();
        this.acceptsConnections = true;
    }

    public final synchronized void connect(long nativePtr, String url, String[][] headers) {
        if (this.acceptsConnections) {
            disconnect();
            ztw0 ztw0VarCreateRequestBuilder = createRequestBuilder(url, headers);
            ztw0VarCreateRequestBuilder.getClass();
            zuu0 zuu0VarM95348b = ((z4l0) this.callFactory).m95348b(new auw0(ztw0VarCreateRequestBuilder));
            this.call = zuu0VarM95348b;
            zuu0VarM95348b.m97070e(new gd5(this, nativePtr, 2));
        }
    }

    public final synchronized void detachFromCore() {
        m9162x34e96186();
        nativeUninstall();
    }

    public final synchronized void disconnect() {
        y8b y8bVar = this.call;
        if (y8bVar != null) {
            ((zuu0) y8bVar).cancel();
        }
        this.call = null;
    }

    /* JADX INFO: renamed from: stopConnections$src_main_java_com_spotify_decipher_transport_transport */
    public final synchronized void m9162x34e96186() {
        this.acceptsConnections = false;
        disconnect();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DecipherSseTransport(ie41 ie41Var) {
        y4l0 y4l0VarM95347a = ((je41) ie41Var).f111452b.m95347a();
        y4l0VarM95347a.f269172a = new osr();
        y4l0VarM95347a.m92815b(0L, TimeUnit.SECONDS);
        this(new z4l0(y4l0VarM95347a));
    }
}
