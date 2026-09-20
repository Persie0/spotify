package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class k4e0 extends qe70 implements fh00 {

    /* JADX INFO: renamed from: b */
    public static final k4e0 f119203b;

    /* JADX INFO: renamed from: c */
    public static final k4e0 f119204c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119205a;

    static {
        int i = 10;
        f119203b = new k4e0(i, 0);
        f119204c = new k4e0(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4e0(int i, int i2) {
        super(i);
        this.f119205a = i2;
    }

    @Override // p204p.fh00
    /* JADX INFO: renamed from: h1 */
    public final Object mo38484h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        switch (this.f119205a) {
            case 0:
                return new e4e0((f5r0) obj, (x430) obj2, (v140) obj3, (yfj) obj5, (erc1) obj6, (p9c1) obj7, (ok11) obj8, (erc1) obj9, (g0w) obj10, (thj) obj4);
            default:
                Map map = (Map) obj6;
                Map map2 = (Map) obj9;
                return new s7g0((k69) obj2, (k69) obj, cks.m33187f(((daj) obj4).f47050a), cks.m33187f(((daj) obj3).f47050a), map2, map, (Map) obj5, (Map) obj7, (Map) obj8, (o0x0) obj10);
        }
    }
}
