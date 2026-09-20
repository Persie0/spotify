package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class ebc0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57900a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f57901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebc0(int i, gh00 gh00Var) {
        super(1);
        this.f57900a = i;
        this.f57901b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f57900a) {
            case 0:
                this.f57901b.invoke(y9i0.f270605b);
                return w2a1.f247311a;
            case 1:
                this.f57901b.invoke(y9i0.f270609f);
                return w2a1.f247311a;
            case 2:
                this.f57901b.invoke(y9i0.f270606c);
                return w2a1.f247311a;
            case 3:
                this.f57901b.invoke(y9i0.f270608e);
                return w2a1.f247311a;
            case 4:
                this.f57901b.invoke(opc0.f167864a);
                return w2a1.f247311a;
            case 5:
                gy20 gy20Var = (gy20) obj;
                boolean z = gy20Var instanceof zx20;
                gh00 gh00Var = this.f57901b;
                if (z) {
                    gh00Var.invoke(new fwc0(((zx20) gy20Var).f287183a));
                } else if (gy20Var.equals(cy20.f43143a)) {
                    gh00Var.invoke(zwc0.f286959a);
                } else if (!(gy20Var instanceof wx20) && !(gy20Var instanceof xx20) && !(gy20Var instanceof yx20) && !(gy20Var instanceof by20) && !(gy20Var instanceof ay20) && !(gy20Var instanceof dy20) && !gy20Var.equals(ey20.f63928a) && !(gy20Var instanceof fy20)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 6:
                this.f57901b.invoke(new ebd0(((Number) obj).floatValue() > 1.0f));
                return w2a1.f247311a;
            case 7:
                this.f57901b.invoke(new vid0((wxd0) obj));
                return w2a1.f247311a;
            case 8:
                this.f57901b.invoke(new qid0((tfd0) obj));
                return w2a1.f247311a;
            case 9:
                this.f57901b.invoke(ajd0.f16246a);
                return w2a1.f247311a;
            case 10:
                Collection collectionValues = ((Map) obj).values();
                boolean z2 = collectionValues instanceof Collection;
                gh00 gh00Var2 = this.f57901b;
                if (z2 && collectionValues.isEmpty()) {
                    gh00Var2.invoke(xid0.f261846a);
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            gh00Var2.invoke(yid0.f273083a);
                        }
                    }
                    gh00Var2.invoke(xid0.f261846a);
                }
                return w2a1.f247311a;
            case 11:
                this.f57901b.invoke(ajd0.f16246a);
                return w2a1.f247311a;
            case 12:
                rs71 rs71Var = (rs71) obj;
                boolean z3 = rs71Var instanceof ls71;
                gh00 gh00Var3 = this.f57901b;
                if (z3) {
                    gh00Var3.invoke(qud0.f192643a);
                } else if (rs71Var instanceof ms71) {
                    gh00Var3.invoke(rud0.f202802a);
                } else if (rs71Var instanceof qs71) {
                    uk91 uk91Var = ((qs71) rs71Var).f192031a;
                    gh00Var3.invoke(new vud0(uk91Var.f231264a, uk91Var.f231265b));
                } else if (rs71Var instanceof ns71) {
                    gh00Var3.invoke(new tud0(((ns71) rs71Var).f157713a));
                } else if (rs71Var instanceof os71) {
                    gh00Var3.invoke(new uud0(((os71) rs71Var).f168769a));
                } else if (!(rs71Var instanceof ps71)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 13:
                this.f57901b.invoke((wud0) obj);
                return w2a1.f247311a;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    this.f57901b.invoke(wxd0.IMAGE);
                }
                return w2a1.f247311a;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    this.f57901b.invoke(wxd0.VIDEO);
                }
                return w2a1.f247311a;
            case 16:
                this.f57901b.invoke(new ssw(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 17:
                ((Boolean) obj).booleanValue();
                this.f57901b.invoke(gzw.f86047a);
                return w2a1.f247311a;
            case 18:
                this.f57901b.invoke(new ssw(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 19:
                this.f57901b.invoke(new k7e0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 20:
                this.f57901b.invoke((uw70) obj);
                return w2a1.f247311a;
            case 21:
                this.f57901b.invoke(new oae0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 22:
                this.f57901b.invoke(new ule0((String) obj));
                return w2a1.f247311a;
            case 23:
                this.f57901b.invoke(new pwf0((String) obj));
                return w2a1.f247311a;
            case 24:
                if (ixf0.f106683a[((xxf0) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f57901b.invoke(axf0.f20847a);
                return w2a1.f247311a;
            case 25:
                this.f57901b.invoke(new rwf0(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 26:
                this.f57901b.invoke((nbo0) obj);
                return w2a1.f247311a;
            case 27:
                this.f57901b.invoke((nbo0) obj);
                return w2a1.f247311a;
            case 28:
                this.f57901b.invoke(new zai0(((Number) obj).intValue()));
                return w2a1.f247311a;
            default:
                this.f57901b.invoke(Integer.valueOf((int) (((Number) obj).floatValue() * 100)));
                return w2a1.f247311a;
        }
    }
}
