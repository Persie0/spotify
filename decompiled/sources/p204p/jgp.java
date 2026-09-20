package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes9.dex */
public class jgp extends pbw implements toc1, bbm0 {

    /* JADX INFO: renamed from: B1 */
    public q5q0 f112232B1;

    /* JADX INFO: renamed from: C1 */
    public u18 f112233C1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q5q0 q5q0Var = this.f112232B1;
        zwp zwpVarM92299a = q5q0Var.f185575b.m92299a(m49702X0());
        zwpVarM92299a.m97153F(this, q5q0Var.f185574a.get());
        return zwpVarM92299a;
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a */
    public final voc1 getF225715T1() {
        return xoc1.f264193t2;
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90799g6();
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return zy5.m97224e(xgg1.m90799g6(), null);
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: j */
    public final String mo24331j() {
        return "podcast_episodes_tab";
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: k */
    public final String mo24332k(Context context) {
        return this.f112233C1.f225708a;
    }

    @Override // p204p.zfy
    /* JADX INFO: renamed from: l */
    public final agy getF18210S1() {
        return k0e1.f118053r;
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: e */
    public final i500 mo32198e() {
        return this;
    }
}
