package p204p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class f3q0 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final s1e1 f65569d;

    /* JADX INFO: renamed from: e */
    public final kgc f65570e;

    /* JADX INFO: renamed from: f */
    public ArrayList f65571f = new ArrayList();

    public f3q0(s1e1 s1e1Var, kgc kgcVar) {
        this.f65569d = s1e1Var;
        this.f65570e = kgcVar;
        m47720w(true);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f65571f.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        return ((y0w) this.f65571f.get(i)).f268092b.hashCode();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return this.f65569d.m76951g((y0w) this.f65571f.get(i));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        y0w y0wVar = (y0w) this.f65571f.get(i);
        y0wVar.getClass();
        dkv0Var.f50039a.setVisibility(0);
        s1e1 s1e1Var = this.f65569d;
        ux0 ux0Var = (ux0) ((HashMap) s1e1Var.f204704c).get(Integer.valueOf(s1e1Var.m76951g(y0wVar)));
        if (ux0Var == null) {
            throw new IllegalStateException(s571.m77246e(dkv0Var.f50044f, "No AdapterDelegate added for ViewType "));
        }
        ux0Var.mo52319b(y0wVar, dkv0Var);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        s1e1 s1e1Var = this.f65569d;
        ux0 ux0Var = (ux0) ((HashMap) s1e1Var.f204704c).get(Integer.valueOf(i));
        if (ux0Var != null) {
            return ux0Var.mo52318a((LayoutInflater) s1e1Var.f204705d, viewGroup);
        }
        throw new IllegalStateException(s571.m77246e(i, "No AdapterDelegate added for ViewType"));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: s */
    public final void mo31053s(dkv0 dkv0Var) {
        int iM36323m = dkv0Var.m36323m();
        if (iM36323m > -1) {
            y0w y0wVar = (y0w) this.f65571f.get(iM36323m);
            y0wVar.getClass();
            s1e1 s1e1Var = this.f65569d;
            if (((ux0) ((HashMap) s1e1Var.f204704c).get(Integer.valueOf(s1e1Var.m76951g(y0wVar)))) == null) {
                throw new IllegalStateException(s571.m77246e(dkv0Var.f50044f, "No AdapterDelegate added for ViewType "));
            }
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: t */
    public final void mo31054t(dkv0 dkv0Var) {
        int iM36323m = dkv0Var.m36323m();
        if (iM36323m > -1) {
            y0w y0wVar = (y0w) this.f65571f.get(iM36323m);
            y0wVar.getClass();
            s1e1 s1e1Var = this.f65569d;
            if (((ux0) ((HashMap) s1e1Var.f204704c).get(Integer.valueOf(s1e1Var.m76951g(y0wVar)))) == null) {
                throw new IllegalStateException(s571.m77246e(dkv0Var.f50044f, "No AdapterDelegate added for ViewType "));
            }
        }
    }
}
