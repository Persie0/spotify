package p204p;

import android.view.View;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.encoremobile.component.icons.IconEnhanceBadge;

/* JADX INFO: loaded from: classes3.dex */
public final class ai81 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ci81 f15909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mh81 f15910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15911c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IconAddBadgeView f15912d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ IconRemoveBadgeView f15913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ IconEnhanceBadge f15914f;

    public ai81(ci81 ci81Var, mh81 mh81Var, int i, IconAddBadgeView iconAddBadgeView, IconRemoveBadgeView iconRemoveBadgeView, IconEnhanceBadge iconEnhanceBadge) {
        this.f15909a = ci81Var;
        this.f15910b = mh81Var;
        this.f15911c = i;
        this.f15912d = iconAddBadgeView;
        this.f15913e = iconRemoveBadgeView;
        this.f15914f = iconEnhanceBadge;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mh81 mh81Var = this.f15910b;
        String str = mh81Var.f143732h;
        String str2 = mh81Var.f143725a;
        ci81 ci81Var = this.f15909a;
        if (ci81Var.f38252t) {
            return;
        }
        boolean z = mh81Var.f143727c;
        IconRemoveBadgeView iconRemoveBadgeView = this.f15913e;
        IconAddBadgeView iconAddBadgeView = this.f15912d;
        int i = this.f15911c;
        IconEnhanceBadge iconEnhanceBadge = this.f15914f;
        if (z) {
            ci81Var.f38250h.invoke(new ei81(str2, i, str));
            iconAddBadgeView.setIconActive(false);
            iconRemoveBadgeView.setIconVisible(true);
            iconEnhanceBadge.setVisibility(8);
            return;
        }
        iconEnhanceBadge.animate().setDuration(300L).translationXBy(-iconEnhanceBadge.getWidth()).start();
        ci81Var.f38250h.invoke(new fi81(str2, i, str));
        iconAddBadgeView.setIconActive(true);
        iconRemoveBadgeView.setIconVisible(false);
        iconEnhanceBadge.setVisibility(mh81Var.f143734j ? 0 : 8);
    }
}
