package p204p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class nq5 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f157126b;

    public /* synthetic */ nq5(int i, ArrayList arrayList) {
        this.f157125a = i;
        this.f157126b = arrayList;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f157125a) {
            case 0:
                return ((jr6) this.f157126b.get(((Number) obj).intValue())).f115092a;
            case 1:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 2:
                return ((lc6) this.f157126b.get(((Number) obj).intValue())).f131830b.f261215b.getUri();
            case 3:
                return qpv0.f191387a.mo54112b(((lc6) this.f157126b.get(((Number) obj).intValue())).f131829a.getClass());
            case 4:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 5:
                return ((akk) this.f157126b.get(((Number) obj).intValue())).f16560a.f178681a;
            case 6:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 7:
                return ((m2j) this.f157126b.get(((Number) obj).intValue())).f139359a;
            case 8:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 9:
                return ((m2j) this.f157126b.get(((Number) obj).intValue())).f139359a;
            case 10:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 11:
                return ((o2c0) this.f157126b.get(((Number) obj).intValue())).getUuid();
            case 12:
                return ((sl00) this.f157126b.get(((Number) obj).intValue())).f210233a;
            case 13:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 14:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 15:
                return ((i3i0) this.f157126b.get(((Number) obj).intValue())).f98186a;
            case 16:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 17:
                return ((ur31) this.f157126b.get(((Number) obj).intValue())).name();
            case 18:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 19:
                m9x m9xVar = (m9x) this.f157126b.get(((Number) obj).intValue());
                if (m9xVar instanceof j9x) {
                    return ((j9x) m9xVar).f110263a;
                }
                if (m9xVar instanceof l9x) {
                    return ((l9x) m9xVar).f131189a;
                }
                if (m9xVar instanceof k9x) {
                    return g6f.m43753y0(lau.f131415a, ",", null, null, null, 62);
                }
                if (m9xVar instanceof i9x) {
                    return ((i9x) m9xVar).f100096a;
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                m9x m9xVar2 = (m9x) this.f157126b.get(((Number) obj).intValue());
                if (m9xVar2 instanceof j9x) {
                    return "event";
                }
                if (m9xVar2 instanceof l9x) {
                    return "venue";
                }
                if (m9xVar2 instanceof k9x) {
                    return "multi_event";
                }
                if (m9xVar2 instanceof i9x) {
                    return "album";
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                bax baxVar = (bax) this.f157126b.get(((Number) obj).intValue());
                if ((baxVar instanceof z9x) || (baxVar instanceof y9x) || (baxVar instanceof aax)) {
                    throw null;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                bax baxVar2 = (bax) this.f157126b.get(((Number) obj).intValue());
                if (baxVar2 instanceof z9x) {
                    return "event";
                }
                if (baxVar2 instanceof y9x) {
                    return "album";
                }
                if (baxVar2 instanceof aax) {
                    return "venue";
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                return this.f157126b.get(((Number) obj).intValue()).getClass().getName();
            case 24:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 25:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 26:
                int iIntValue = ((Number) obj).intValue();
                return Integer.valueOf(iIntValue);
            case 27:
                this.f157126b.get(((Number) obj).intValue());
                return null;
            case 28:
                return ((g8e0) this.f157126b.get(((Number) obj).intValue())).f77470d;
            default:
                this.f157126b.get(((Number) obj).intValue());
                return null;
        }
    }
}
