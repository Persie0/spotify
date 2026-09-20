package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class up30 extends vp30 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f232567g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up30(at30 at30Var, boolean z, int i) {
        super(at30Var, z);
        this.f232567g = i;
    }

    @Override // p204p.tn30, p204p.nl30
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo36444f(ji10 ji10Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        switch (this.f232567g) {
            case 0:
                m81152k((box0) ji10Var, fk30Var, sk30Var);
                break;
            default:
                m81152k((box0) ji10Var, fk30Var, sk30Var);
                break;
        }
    }

    @Override // p204p.vp30, p204p.nl30
    /* JADX INFO: renamed from: g */
    public ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f232567g) {
            case 0:
                break;
        }
        return mo81244n(context, viewGroup);
    }

    @Override // p204p.vp30, p204p.tn30
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void mo70503i(box0 box0Var, fk30 fk30Var) {
        switch (this.f232567g) {
            case 0:
                super.mo70503i((qsx0) box0Var, fk30Var);
                break;
            default:
                mo70503i((qsx0) box0Var, fk30Var);
                break;
        }
    }

    @Override // p204p.vp30
    /* JADX INFO: renamed from: m */
    public void mo70503i(qsx0 qsx0Var, fk30 fk30Var) {
        switch (this.f232567g) {
            case 1:
                super.mo70503i(qsx0Var, fk30Var);
                ((vsx0) qsx0Var).f244508e.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(fk30Var.custom().intValue("row_number", 0))));
                break;
            default:
                super.mo70503i(qsx0Var, fk30Var);
                break;
        }
    }

    @Override // p204p.vp30
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ box0 mo81244n(Context context, ViewGroup viewGroup) {
        switch (this.f232567g) {
            case 0:
                break;
        }
        return mo81244n(context, viewGroup);
    }

    @Override // p204p.vp30
    /* JADX INFO: renamed from: o */
    public qsx0 mo81244n(Context context, ViewGroup viewGroup) {
        switch (this.f232567g) {
            case 0:
                san0 san0VarM25941m = ahf1.m25941m(context, viewGroup, this.f243583f ? R.layout.glue_listtile_2_image_muted : R.layout.glue_listtile_2_image);
                ssx0 ssx0Var = new ssx0(san0VarM25941m);
                san0VarM25941m.setTag(R.id.glue_viewholder_tag, ssx0Var);
                return ssx0Var;
            default:
                san0 san0VarM25941m2 = ahf1.m25941m(context, viewGroup, this.f243583f ? R.layout.glue_listtile_2_number_muted : R.layout.glue_listtile_2_number);
                vsx0 vsx0Var = new vsx0(san0VarM25941m2);
                san0VarM25941m2.setTag(R.id.glue_viewholder_tag, vsx0Var);
                return vsx0Var;
        }
    }
}
