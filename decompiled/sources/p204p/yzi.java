package p204p;

import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class yzi {

    /* JADX INFO: renamed from: a */
    public final wzi f277830a;

    /* JADX INFO: renamed from: b */
    public final wzi f277831b;

    /* JADX INFO: renamed from: c */
    public final ErrorInfo f277832c;

    public yzi(wzi wziVar, wzi wziVar2, ErrorInfo errorInfo) {
        wziVar2.getClass();
        this.f277830a = wziVar;
        this.f277831b = wziVar2;
        this.f277832c = errorInfo;
    }

    public yzi(ErrorInfo errorInfo) {
        wzi wziVar = wzi.connected;
        this.f277830a = wziVar;
        this.f277831b = wziVar;
        this.f277832c = errorInfo;
    }
}
