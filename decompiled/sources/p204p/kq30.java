package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class kq30 extends tn30 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f125207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq30(int i) {
        super(o7z0.class);
        this.f125207f = i;
    }

    @Override // p204p.tn30, p204p.nl30
    /* JADX INFO: renamed from: f */
    public final void mo36444f(ji10 ji10Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        o7z0 o7z0Var = (o7z0) ji10Var;
        m81153l(o7z0Var, fk30Var, sk30Var, mqrVar);
        o7z0Var.f162664f.setText(fk30Var.text().description());
    }

    @Override // p204p.nl30
    /* JADX INFO: renamed from: g */
    public final ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f125207f) {
            case 0:
                p7z0 p7z0Var = (p7z0) this.f221875e;
                boolean z = sk30Var.f209998k;
                p7z0Var.f174790a.getClass();
                o7z0 o7z0Var = new o7z0(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large_description, viewGroup, false), z);
                o7z0Var.getView().setTag(R.id.glue_viewholder_tag, o7z0Var);
                return o7z0Var;
            default:
                p7z0 p7z0Var2 = (p7z0) this.f221875e;
                boolean z2 = sk30Var.f209998k;
                p7z0Var2.f174790a.getClass();
                o7z0 o7z0Var2 = new o7z0(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small_description, viewGroup, false), z2);
                o7z0Var2.getView().setTag(R.id.glue_viewholder_tag, o7z0Var2);
                return o7z0Var2;
        }
    }
}
