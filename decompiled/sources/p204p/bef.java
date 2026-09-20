package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bef extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final View f26342S0;

    /* JADX INFO: renamed from: T0 */
    public final up60 f26343T0;

    public bef(View view, up60 up60Var) {
        super(view);
        this.f26342S0 = view;
        this.f26343T0 = up60Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m28918D(uhf uhfVar, int i, boolean z, String str, e2a e2aVar) {
        this.f26342S0.setTag(R.id.comments_list_entity_type, uhfVar.f230443a);
        vgg1.m85469j(this.f26343T0, uhfVar);
        mo28920F(uhfVar, i, z, str);
        mo28919E(uhfVar, i, e2aVar);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo28919E(uhf uhfVar, int i, e2a e2aVar);

    /* JADX INFO: renamed from: F */
    public abstract void mo28920F(uhf uhfVar, int i, boolean z, String str);
}
