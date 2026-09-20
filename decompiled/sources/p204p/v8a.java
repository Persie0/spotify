package p204p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v8a extends s8a {

    /* JADX INFO: renamed from: d */
    public final byte[] f238447d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f238448e;

    /* JADX INFO: renamed from: f */
    public final byte[] f238449f;

    public v8a(byte[] bArr, LinkedHashMap linkedHashMap, byte[] bArr2) {
        super(bArr, linkedHashMap, bArr2);
        this.f238447d = bArr;
        this.f238448e = linkedHashMap;
        this.f238449f = bArr2;
    }

    @Override // p204p.s8a
    /* JADX INFO: renamed from: a */
    public final byte[] mo77466a() {
        return this.f238447d;
    }

    @Override // p204p.s8a
    /* JADX INFO: renamed from: b */
    public final byte[] mo77467b() {
        return this.f238449f;
    }

    @Override // p204p.s8a
    /* JADX INFO: renamed from: c */
    public final Map mo77468c() {
        return this.f238448e;
    }
}
