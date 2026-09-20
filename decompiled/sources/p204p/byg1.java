package p204p;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class byg1 implements d7x0 {

    /* JADX INFO: renamed from: a */
    public final Status f32228a;

    /* JADX INFO: renamed from: b */
    public final lg5 f32229b;

    /* JADX INFO: renamed from: c */
    public final String f32230c;

    /* JADX INFO: renamed from: d */
    public final String f32231d;

    /* JADX INFO: renamed from: e */
    public final boolean f32232e;

    public byg1(Status status, lg5 lg5Var, String str, String str2, boolean z) {
        this.f32228a = status;
        this.f32229b = lg5Var;
        this.f32230c = str;
        this.f32231d = str2;
        this.f32232e = z;
    }

    /* JADX INFO: renamed from: a */
    public final lg5 m30887a() {
        return this.f32229b;
    }

    /* JADX INFO: renamed from: b */
    public final String m30888b() {
        return this.f32230c;
    }

    /* JADX INFO: renamed from: c */
    public final String m30889c() {
        return this.f32231d;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m30890d() {
        return this.f32232e;
    }

    @Override // p204p.d7x0
    public final Status getStatus() {
        return this.f32228a;
    }
}
