package p204p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: p.u0 */
/* JADX INFO: loaded from: classes15.dex */
public final class C2435u0 implements m6n0 {

    /* JADX INFO: renamed from: a */
    public final qre0 f225335a;

    /* JADX INFO: renamed from: b */
    public C1880g0 f225336b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f225337c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f225338d = new LinkedHashMap();

    public C2435u0(C1761d0 c1761d0, qre0 qre0Var) {
        this.f225335a = qre0Var;
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: a */
    public final Observable mo61021a(int i, String str, String str2) {
        String str3 = "spotify_listening_parties:" + str2 + ":media";
        int[] iArrM38551G = edb.m38551G(3);
        ArrayList arrayList = new ArrayList(iArrM38551G.length);
        for (int i2 : iArrM38551G) {
            arrayList.add(AbstractC1650a0.m24306c(i2));
        }
        return Observable.create(new C2147n0(this, str, str2, str3, (String[]) arrayList.toArray(new String[0]), c95.m31821M(pft0.m69840u("rewind", i + "s")), new C2321r0(this, str3))).flatMapMaybe(new C1880g0((gh00) C2358s0.f204269h)).doOnError(new C2197o0(this, str2, str3, 0)).doOnNext(new C2197o0(this, str3, str2, 1));
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: b */
    public final Observable mo61022b(int i, String str, String str2) {
        String str3 = "spotify_listening_parties:" + str2 + ":chat";
        int[] iArr_values = AbstractC1650a0._values();
        ArrayList arrayList = new ArrayList(iArr_values.length);
        for (int i2 : iArr_values) {
            arrayList.add(AbstractC1650a0.m24304a(i2));
        }
        return Observable.create(new C2147n0(this, str, str2, str3, (String[]) arrayList.toArray(new String[0]), c95.m31821M(pft0.m69840u("rewind", i + "s")), null)).flatMapMaybe(new C1880g0((gh00) C2235p0.f172419h)).doOnError(new C2197o0(this, str2, str3, 0));
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: c */
    public final Observable mo61023c(String str, String str2) {
        String str3 = "spotify_listening_parties:" + str2 + ":occupancy";
        return Observable.create(new C2147n0(this, str, str2, str3, new String[]{"EMIT_OCCUPANCY"}, nau.f152117a, null)).flatMapMaybe(new C1880g0((gh00) C2396t0.f215705h)).doOnError(new C2197o0(this, str2, str3, 0));
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: d */
    public final Observable mo61024d(String str, String str2) {
        String str3 = "spotify_listening_parties:" + str2 + ":lifecycle";
        int[] iArrM38551G = edb.m38551G(3);
        ArrayList arrayList = new ArrayList(iArrM38551G.length);
        for (int i : iArrM38551G) {
            arrayList.add(AbstractC1650a0.m24305b(i));
        }
        return Observable.create(new C2147n0(this, str, str2, str3, (String[]) arrayList.toArray(new String[0]), c95.m31821M(pft0.m69840u("rewind", "5s")), null)).flatMapMaybe(new C1880g0((gh00) C2276q0.f183870h)).doOnError(new C2197o0(this, str2, str3, 0));
    }
}
