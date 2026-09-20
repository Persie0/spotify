package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class hif1 extends AbstractC1928h8 {

    /* JADX INFO: renamed from: b */
    public final Object f91810b;

    /* JADX INFO: renamed from: c */
    public int f91811c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zif1 f91812d;

    public hif1(zif1 zif1Var, int i) {
        super(false, 1);
        this.f91812d = zif1Var;
        Object obj = zif1.f283154t;
        this.f91810b = zif1Var.m96205b()[i];
        this.f91811c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m47634a() {
        int i = this.f91811c;
        Object obj = this.f91810b;
        zif1 zif1Var = this.f91812d;
        if (i != -1 && i < zif1Var.size()) {
            if (qvf1.m74003H(obj, zif1Var.m96205b()[this.f91811c])) {
                return;
            }
        }
        Object obj2 = zif1.f283154t;
        this.f91811c = zif1Var.m96211h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f91810b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zif1 zif1Var = this.f91812d;
        Map mapM96207d = zif1Var.m96207d();
        if (mapM96207d != null) {
            return mapM96207d.get(this.f91810b);
        }
        m47634a();
        int i = this.f91811c;
        if (i == -1) {
            return null;
        }
        return zif1Var.m96206c()[i];
    }

    @Override // p204p.AbstractC1928h8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zif1 zif1Var = this.f91812d;
        Map mapM96207d = zif1Var.m96207d();
        Object obj2 = this.f91810b;
        if (mapM96207d != null) {
            return mapM96207d.put(obj2, obj);
        }
        m47634a();
        int i = this.f91811c;
        if (i == -1) {
            zif1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = zif1Var.m96206c()[i];
        zif1Var.m96206c()[this.f91811c] = obj;
        return obj3;
    }
}
