package p204p;

import java.io.IOException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gpv0 implements hr60 {

    /* JADX INFO: renamed from: a */
    public final Object f83254a = q3d0.m72078I(2, new u1v0(this, 1));

    public final boolean equals(Object obj) {
        if (!(obj instanceof gpv0)) {
            return false;
        }
        gpv0 gpv0Var = (gpv0) obj;
        return wj50.m88271j(mo42980g(), gpv0Var.mo42980g()) && getIndex() == gpv0Var.getIndex();
    }

    /* JADX INFO: renamed from: g */
    public abstract cpv0 mo42980g();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.qp60
    public List getAnnotations() {
        return (List) this.f83254a.getValue();
    }

    public final int hashCode() {
        return Integer.hashCode(getIndex()) + (mo42980g().hashCode() * 31);
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo42981p();

    public final String toString() throws IOException {
        String string;
        StringBuilder sb = new StringBuilder();
        int iM38547C = edb.m38547C(getKind());
        if (iM38547C == 0) {
            sb.append("instance parameter");
        } else if (iM38547C == 1) {
            sb.append("context parameter " + getName());
        } else if (iM38547C == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append("parameter #" + getIndex() + ' ' + getName());
        }
        sb.append(" of ");
        cpv0 cpv0VarMo42980g = mo42980g();
        if (cpv0VarMo42980g instanceof qr60) {
            string = qyq0.m74223h((qr60) cpv0VarMo42980g);
        } else {
            if (!(cpv0VarMo42980g instanceof oq60)) {
                throw new IllegalStateException(("Illegal callable: " + cpv0VarMo42980g).toString());
            }
            oq60 oq60Var = (oq60) cpv0VarMo42980g;
            StringBuilder sb2 = new StringBuilder();
            qyq0.m74218a(sb2, oq60Var);
            sb2.append("fun ");
            qyq0.m74220c(sb2, oq60Var);
            qyq0.m74219b(sb2, oq60Var.getName());
            g6f.m43752x0(oqg1.m67642k(oq60Var), sb2, ", ", "(", ")", hrl0.f94468Z, 48);
            sb2.append(": ");
            sb2.append(qyq0.m74225j(oq60Var.mo25530i(), false));
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }
}
