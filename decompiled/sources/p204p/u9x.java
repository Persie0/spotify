package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p000.C1398e;

/* JADX INFO: loaded from: classes.dex */
public final class u9x {

    /* JADX INFO: renamed from: a */
    public Long f228305a;

    /* JADX INFO: renamed from: b */
    public final ljx0 f228306b;

    /* JADX INFO: renamed from: c */
    public final ar0 f228307c = new ar0(4);

    public u9x(ljx0 ljx0Var) {
        this.f228306b = ljx0Var;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m82654a(Collection collection, Collection collection2, l8x l8xVar) {
        nsf1.m65528n(this.f228306b, false, true, new tsv(23, this, (AbstractList) collection));
        nsf1.m65528n(l8xVar.f130954a, false, true, new tsv(18, l8xVar, (LinkedList) collection2));
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void m82656c(AbstractList abstractList) {
        if (abstractList.size() <= 999) {
            m82658e(abstractList);
            return;
        }
        ArrayList arrayList = new ArrayList(ResolvedHome.ONDEMAND_SET_FIELD_NUMBER);
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            if (arrayList.size() == 999) {
                m82658e(arrayList);
                arrayList.clear();
            }
        }
        if (arrayList.size() > 0) {
            m82658e(arrayList);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m82658e(AbstractList abstractList) {
        StringBuilder sbM36620t = dq60.m36620t("DELETE FROM Events WHERE id IN (");
        n0e1.m63421b(abstractList.size(), sbM36620t);
        sbM36620t.append(")");
        nsf1.m65528n(this.f228306b, false, true, new C1398e(11, sbM36620t.toString(), abstractList));
    }

    /* JADX INFO: renamed from: f */
    public final List m82659f(long j, String str) {
        int i = 1;
        if (str == null) {
            return (List) nsf1.m65528n(this.f228306b, true, false, new q22(6, j));
        }
        int i2 = yd20.f271624a;
        return (List) nsf1.m65528n(this.f228306b, true, false, new v22(j, bdi0.f26116Z.m93080q(str).toString(), i));
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m82660g(String str, byte[] bArr, xsz0 xsz0Var, byte[] bArr2, t4x t4xVar, wra0 wra0Var, boolean z, String str2, String str3, long j) {
        String string;
        if (str2 != null) {
            int i = yd20.f271624a;
            string = bdi0.f26116Z.m93080q(str2).toString();
        } else {
            string = null;
        }
        c5x c5xVar = new c5x();
        c5xVar.f34304c = str;
        c5xVar.f34308g = string;
        c5xVar.f34303b = Boolean.valueOf(z);
        c5xVar.f34305d = bArr2;
        c5xVar.f34309h = str3;
        c5xVar.f34307f = zzg1.m97323v(bArr, j, t4xVar).toByteArray();
        long jM91995a = xsz0Var.m91995a(1, str, bArr2);
        c5xVar.f34306e = jM91995a;
        long jLongValue = ((Number) nsf1.m65528n(this.f228306b, false, true, new tsv(24, this, c5xVar))).longValue();
        Long l = this.f228305a;
        if (l != null && l.longValue() >= jLongValue) {
            throw new IllegalStateException("DB is overriding saved events for event ".concat(str));
        }
        this.f228305a = Long.valueOf(jLongValue);
        if (xsz0Var.m91996b(str, bArr2) == jM91995a) {
            throw new IllegalStateException("DB is overriding saved sequence numbers for event ".concat(str));
        }
        wra0Var.mo46852b();
    }
}
