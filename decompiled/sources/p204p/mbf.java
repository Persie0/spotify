package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes8.dex */
public final class mbf implements omc0 {

    /* JADX INFO: renamed from: a */
    public final y380 f141897a;

    /* JADX INFO: renamed from: b */
    public final j4f f141898b;

    public mbf(y380 y380Var, j4f j4fVar) {
        this.f141897a = y380Var;
        this.f141898b = j4fVar;
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: a */
    public final Single mo52340a(String str, String str2) {
        this.f141898b.mo52340a(str, str2).subscribe();
        return this.f141897a.mo52340a(str, str2);
    }

    @Override // p204p.omc0
    /* JADX INFO: renamed from: b */
    public final Single mo52341b(String str, String str2) {
        this.f141898b.mo52341b(str, str2).subscribe();
        return this.f141897a.mo52341b(str, str2);
    }
}
