package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class jq30 extends tn30 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f114777f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq30(Class cls, int i) {
        super(cls);
        this.f114777f = i;
    }

    @Override // p204p.nl30
    /* JADX INFO: renamed from: g */
    public final ji10 mo36445g(Context context, ViewGroup viewGroup, sk30 sk30Var) {
        switch (this.f114777f) {
            case 0:
                p7z0 p7z0Var = (p7z0) this.f221875e;
                boolean z = sk30Var.f209998k;
                p7z0Var.f174790a.getClass();
                h7z0 h7z0Var = new h7z0(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_large, viewGroup, false), z);
                h7z0Var.getView().setTag(R.id.glue_viewholder_tag, h7z0Var);
                return h7z0Var;
            default:
                p7z0 p7z0Var2 = (p7z0) this.f221875e;
                boolean z2 = sk30Var.f209998k;
                p7z0Var2.f174790a.getClass();
                h7z0 h7z0Var2 = new h7z0(LayoutInflater.from(context).inflate(R.layout.glue_sectionheader_small, viewGroup, false), z2);
                h7z0Var2.getView().setTag(R.id.glue_viewholder_tag, h7z0Var2);
                return h7z0Var2;
        }
    }
}
