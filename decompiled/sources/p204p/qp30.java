package p204p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public class qp30 extends sp30 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f191119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp30(at30 at30Var, int i) {
        super(at30Var);
        this.f191119f = i;
    }

    @Override // p204p.tn30, p204p.nl30
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo36444f(ji10 ji10Var, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        switch (this.f191119f) {
            case 1:
                m81152k((box0) ji10Var, fk30Var, sk30Var);
                break;
            case 2:
                m81152k((box0) ji10Var, fk30Var, sk30Var);
                break;
            default:
                super.mo36444f(ji10Var, fk30Var, sk30Var, mqrVar);
                break;
        }
    }

    @Override // p204p.sp30, p204p.nl30
    /* JADX INFO: renamed from: g */
    public ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f191119f) {
            case 1:
                return mo70505n(context, viewGroup);
            case 2:
                return mo70505n(context, viewGroup);
            default:
                return super.mo36445g(context, viewGroup, sk30Var);
        }
    }

    @Override // p204p.sp30, p204p.tn30
    /* JADX INFO: renamed from: i */
    public void mo70503i(box0 box0Var, fk30 fk30Var) {
        switch (this.f191119f) {
            case 0:
                mo70503i((trx0) box0Var, fk30Var);
                break;
            case 1:
                ((trx0) box0Var).mo54202l(dyu.m37388t(fk30Var));
                break;
            default:
                ((trx0) box0Var).mo54202l(dyu.m37388t(fk30Var));
                break;
        }
    }

    @Override // p204p.sp30
    /* JADX INFO: renamed from: m */
    public void mo70503i(trx0 trx0Var, fk30 fk30Var) {
        switch (this.f191119f) {
            case 0:
                CharSequence charSequenceM37388t = dyu.m37388t(fk30Var);
                CharSequence charSequenceM37392x = dyu.m37392x(fk30Var.text().description(), fk30Var.custom().boolValue("glue:descriptionAsHtml", false));
                if (!TextUtils.isEmpty(charSequenceM37388t)) {
                    trx0Var.mo54202l(charSequenceM37388t);
                } else if (!TextUtils.isEmpty(charSequenceM37392x)) {
                    trx0Var.mo54202l(charSequenceM37392x);
                }
                break;
            default:
                super.mo70503i(trx0Var, fk30Var);
                break;
        }
    }

    @Override // p204p.sp30
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ box0 mo70505n(Context context, ViewGroup viewGroup) {
        switch (this.f191119f) {
            case 0:
                break;
            case 1:
                break;
        }
        return mo70505n(context, viewGroup);
    }

    @Override // p204p.sp30
    /* JADX INFO: renamed from: o */
    public trx0 mo70505n(Context context, ViewGroup viewGroup) {
        switch (this.f191119f) {
            case 0:
                san0 san0VarM25941m = ahf1.m25941m(context, viewGroup, R.layout.glue_listtile_1);
                jrx0 jrx0Var = new jrx0(san0VarM25941m);
                jrx0Var.m54200b(Alert.DURATION_SHOW_INDEFINITELY);
                san0VarM25941m.setTag(R.id.glue_viewholder_tag, jrx0Var);
                return jrx0Var;
            case 1:
                san0 san0VarM25941m2 = ahf1.m25941m(context, viewGroup, R.layout.glue_listtile_1_small);
                vrx0 vrx0Var = new vrx0(san0VarM25941m2);
                san0VarM25941m2.setTag(R.id.glue_viewholder_tag, vrx0Var);
                return vrx0Var;
            default:
                san0 san0VarM25941m3 = ahf1.m25941m(context, viewGroup, R.layout.glue_listtile_1_image);
                urx0 urx0Var = new urx0(san0VarM25941m3);
                san0VarM25941m3.setTag(R.id.glue_viewholder_tag, urx0Var);
                return urx0Var;
        }
    }
}
