package p204p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class zgw extends jd21 {

    /* JADX INFO: renamed from: b */
    public final jn91 f282719b;

    /* JADX INFO: renamed from: c */
    public final ggw f282720c;

    /* JADX INFO: renamed from: d */
    public final chw f282721d;

    /* JADX INFO: renamed from: e */
    public final List f282722e;

    /* JADX INFO: renamed from: f */
    public final boolean f282723f;

    /* JADX INFO: renamed from: g */
    public final String[] f282724g;

    /* JADX INFO: renamed from: h */
    public final String f282725h;

    public zgw(jn91 jn91Var, ggw ggwVar, chw chwVar, List list, boolean z, String... strArr) {
        this.f282719b = jn91Var;
        this.f282720c = ggwVar;
        this.f282721d = chwVar;
        this.f282722e = list;
        this.f282723f = z;
        this.f282724g = strArr;
        String str = chwVar.f38123a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f282725h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: A0 */
    public final List mo36061A0() {
        return this.f282722e;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: B0 */
    public final gn91 mo36062B0() {
        gn91.f82663b.getClass();
        return gn91.f82664c;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: C0 */
    public final jn91 mo36063C0() {
        return this.f282719b;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: D0 */
    public final boolean mo36064D0() {
        return this.f282723f;
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: J */
    public final bfe0 mo36065J() {
        return this.f282720c;
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: J0 */
    public final jd21 mo35109G0(boolean z) {
        String[] strArr = this.f282724g;
        return new zgw(this.f282719b, this.f282720c, this.f282721d, this.f282722e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p204p.gd70
    /* JADX INFO: renamed from: E0 */
    public final gd70 mo41684E0(ld70 ld70Var) {
        return this;
    }

    @Override // p204p.d6a1
    /* JADX INFO: renamed from: H0 */
    public final d6a1 mo35110H0(ld70 ld70Var) {
        return this;
    }

    @Override // p204p.jd21, p204p.d6a1
    /* JADX INFO: renamed from: I0 */
    public final d6a1 mo35111I0(gn91 gn91Var) {
        return this;
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: K0 */
    public final jd21 mo35111I0(gn91 gn91Var) {
        return this;
    }
}
