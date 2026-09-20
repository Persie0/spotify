package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ogl implements u9m0, kx41 {

    /* JADX INFO: renamed from: a */
    public hr91 f165181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ngj f165182b;

    public ogl(ngj ngjVar) {
        this.f165182b = ngjVar;
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f165181a = this.f165182b.mo34693a(context, null, layoutInflater, viewGroup);
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: d */
    public final void mo57584d(Bundle bundle) {
        hr91 hr91Var = this.f165181a;
        x3x0 x3x0Var = hr91Var instanceof x3x0 ? (x3x0) hr91Var : null;
        if (x3x0Var != null) {
            sut sutVar = (sut) x3x0Var;
            sutVar.f214216d = bundle;
            Iterator it = sutVar.f214215c.iterator();
            while (it.hasNext()) {
                ((gh00) it.next()).invoke(bundle);
            }
        }
    }

    @Override // p204p.kx41
    /* JADX INFO: renamed from: f */
    public final Bundle mo57585f() {
        Bundle bundle = new Bundle();
        hr91 hr91Var = this.f165181a;
        x3x0 x3x0Var = hr91Var instanceof x3x0 ? (x3x0) hr91Var : null;
        if (x3x0Var != null) {
            Iterator it = ((sut) x3x0Var).f214214b.iterator();
            while (it.hasNext()) {
                ((gh00) it.next()).invoke(bundle);
            }
        }
        return bundle;
    }

    @Override // p204p.u9m0
    public final View getView() {
        hr91 hr91Var = this.f165181a;
        if (hr91Var != null) {
            return (View) hr91Var.getView();
        }
        return null;
    }

    @Override // p204p.u9m0
    public final void start() {
        hr91 hr91Var = this.f165181a;
        if (hr91Var != null) {
            hr91Var.start();
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        hr91 hr91Var = this.f165181a;
        if (hr91Var != null) {
            hr91Var.stop();
        }
    }
}
