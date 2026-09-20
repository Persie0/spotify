package p204p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class t800 implements x691 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f217934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f217935b;

    public t800(View view, ArrayList arrayList) {
        this.f217934a = view;
        this.f217935b = arrayList;
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        z691Var.mo55874G(this);
        this.f217934a.setVisibility(8);
        ArrayList arrayList = this.f217935b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: g */
    public final void mo32235g(z691 z691Var) {
        z691Var.mo55874G(this);
        z691Var.m95486b(this);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: a */
    public final void mo32230a() {
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: c */
    public final void mo32232c() {
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
    }
}
