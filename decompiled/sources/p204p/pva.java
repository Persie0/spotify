package p204p;

import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pva extends qva {

    /* JADX INFO: renamed from: e */
    public ArrayList f181673e;

    public pva(char[] cArr) {
        super(cArr);
        this.f181673e = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public final qva m71115A(String str) {
        Iterator it = this.f181673e.iterator();
        while (it.hasNext()) {
            rva rvaVar = (rva) ((qva) it.next());
            if (rvaVar.m73978d().equals(str)) {
                if (rvaVar.f181673e.size() <= 0) {
                    break;
                }
                return (qva) rvaVar.f181673e.get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final String m71116B(int i) throws CLParsingException {
        qva qvaVarM71128r = m71128r(i);
        if (qvaVarM71128r instanceof wva) {
            return qvaVarM71128r.m73978d();
        }
        throw new CLParsingException(s571.m77246e(i, "no string at index "), this);
    }

    /* JADX INFO: renamed from: C */
    public final String m71117C(String str) throws CLParsingException {
        qva qvaVarM71129s = m71129s(str);
        if (qvaVarM71129s instanceof wva) {
            return qvaVarM71129s.m73978d();
        }
        StringBuilder sbM38573v = edb.m38573v("no string found for key <", str, ">, found [", qvaVarM71129s != null ? qvaVarM71129s.m73981j() : null, "] : ");
        sbM38573v.append(qvaVarM71129s);
        throw new CLParsingException(sbM38573v.toString(), this);
    }

    /* JADX INFO: renamed from: D */
    public final String m71118D() {
        qva qvaVarM71136z = m71136z(1);
        if (qvaVarM71136z instanceof wva) {
            return qvaVarM71136z.m73978d();
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final String m71119E(String str) {
        qva qvaVarM71115A = m71115A(str);
        if (qvaVarM71115A instanceof wva) {
            return qvaVarM71115A.m73978d();
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m71120F(String str) {
        for (qva qvaVar : this.f181673e) {
            if ((qvaVar instanceof rva) && ((rva) qvaVar).m73978d().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m71121G() {
        ArrayList arrayList = new ArrayList();
        for (qva qvaVar : this.f181673e) {
            if (qvaVar instanceof rva) {
                arrayList.add(((rva) qvaVar).m73978d());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final void m71122H(String str, qva qvaVar) {
        Iterator it = this.f181673e.iterator();
        while (it.hasNext()) {
            rva rvaVar = (rva) ((qva) it.next());
            if (rvaVar.m73978d().equals(str)) {
                if (rvaVar.f181673e.size() > 0) {
                    rvaVar.f181673e.set(0, qvaVar);
                    return;
                } else {
                    rvaVar.f181673e.add(qvaVar);
                    return;
                }
            }
        }
        rva rvaVar2 = new rva(str.toCharArray());
        rvaVar2.f192950b = 0L;
        rvaVar2.m73982l(str.length() - 1);
        if (rvaVar2.f181673e.size() > 0) {
            rvaVar2.f181673e.set(0, qvaVar);
        } else {
            rvaVar2.f181673e.add(qvaVar);
        }
        this.f181673e.add(rvaVar2);
    }

    /* JADX INFO: renamed from: I */
    public final void m71123I(String str, float f) {
        m71122H(str, new sva(f));
    }

    /* JADX INFO: renamed from: J */
    public final void m71124J(String str, String str2) {
        wva wvaVar = new wva(str2.toCharArray());
        wvaVar.f192950b = 0L;
        wvaVar.m73982l(str2.length() - 1);
        m71122H(str, wvaVar);
    }

    @Override // p204p.qva
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pva) {
            return this.f181673e.equals(((pva) obj).f181673e);
        }
        return false;
    }

    @Override // p204p.qva
    public int hashCode() {
        return Objects.hash(this.f181673e, Integer.valueOf(super.hashCode()));
    }

    /* JADX INFO: renamed from: m */
    public final void m71126m(qva qvaVar) {
        this.f181673e.add(qvaVar);
    }

    @Override // p204p.qva
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public pva clone() {
        pva pvaVar = (pva) super.clone();
        ArrayList arrayList = new ArrayList(this.f181673e.size());
        Iterator it = this.f181673e.iterator();
        while (it.hasNext()) {
            arrayList.add(((qva) it.next()).clone());
        }
        pvaVar.f181673e = arrayList;
        return pvaVar;
    }

    /* JADX INFO: renamed from: r */
    public final qva m71128r(int i) throws CLParsingException {
        if (i < 0 || i >= this.f181673e.size()) {
            throw new CLParsingException(s571.m77246e(i, "no element at index "), this);
        }
        return (qva) this.f181673e.get(i);
    }

    /* JADX INFO: renamed from: s */
    public final qva m71129s(String str) throws CLParsingException {
        Iterator it = this.f181673e.iterator();
        while (it.hasNext()) {
            rva rvaVar = (rva) ((qva) it.next());
            if (rvaVar.m73978d().equals(str)) {
                if (rvaVar.f181673e.size() > 0) {
                    return (qva) rvaVar.f181673e.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(s571.m77251j("no element for key <", str, ">"), this);
    }

    public final int size() {
        return this.f181673e.size();
    }

    /* JADX INFO: renamed from: t */
    public final ova m71130t(String str) {
        qva qvaVarM71115A = m71115A(str);
        if (qvaVarM71115A instanceof ova) {
            return (ova) qvaVarM71115A;
        }
        return null;
    }

    @Override // p204p.qva
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (qva qvaVar : this.f181673e) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(qvaVar);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    /* JADX INFO: renamed from: u */
    public final float m71131u(int i) throws CLParsingException {
        qva qvaVarM71128r = m71128r(i);
        if (qvaVarM71128r != null) {
            return qvaVarM71128r.mo73979e();
        }
        throw new CLParsingException(s571.m77246e(i, "no float at index "), this);
    }

    /* JADX INFO: renamed from: v */
    public final float m71132v(String str) throws CLParsingException {
        qva qvaVarM71129s = m71129s(str);
        if (qvaVarM71129s != null) {
            return qvaVarM71129s.mo73979e();
        }
        StringBuilder sbM38572u = edb.m38572u("no float found for key <", str, ">, found [");
        sbM38572u.append(qvaVarM71129s.m73981j());
        sbM38572u.append("] : ");
        sbM38572u.append(qvaVarM71129s);
        throw new CLParsingException(sbM38572u.toString(), this);
    }

    /* JADX INFO: renamed from: w */
    public final int m71133w(int i) throws CLParsingException {
        qva qvaVarM71128r = m71128r(i);
        if (qvaVarM71128r != null) {
            return qvaVarM71128r.mo73980i();
        }
        throw new CLParsingException(s571.m77246e(i, "no int at index "), this);
    }

    /* JADX INFO: renamed from: x */
    public final int m71134x(String str) throws CLParsingException {
        qva qvaVarM71129s = m71129s(str);
        if (qvaVarM71129s != null) {
            return qvaVarM71129s.mo73980i();
        }
        StringBuilder sbM38572u = edb.m38572u("no int found for key <", str, ">, found [");
        sbM38572u.append(qvaVarM71129s.m73981j());
        sbM38572u.append("] : ");
        sbM38572u.append(qvaVarM71129s);
        throw new CLParsingException(sbM38572u.toString(), this);
    }

    /* JADX INFO: renamed from: y */
    public final uva m71135y(String str) {
        qva qvaVarM71115A = m71115A(str);
        if (qvaVarM71115A instanceof uva) {
            return (uva) qvaVarM71115A;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final qva m71136z(int i) {
        if (i < 0 || i >= this.f181673e.size()) {
            return null;
        }
        return (qva) this.f181673e.get(i);
    }
}
