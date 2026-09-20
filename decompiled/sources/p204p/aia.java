package p204p;

import android.content.Context;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;

/* JADX INFO: loaded from: classes11.dex */
public final class aia extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qsj f15922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aia(qsj qsjVar, int i) {
        super(1);
        this.f15921a = i;
        this.f15922b = qsjVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f15921a) {
            case 0:
                ((ContentRestrictionBadgeView) obj).mo2820d(this.f15922b);
                return w2a1.f247311a;
            case 1:
                ContentRestrictionBadgeView contentRestrictionBadgeView = new ContentRestrictionBadgeView((Context) obj, null, 2, null);
                contentRestrictionBadgeView.mo2820d(this.f15922b);
                return contentRestrictionBadgeView;
            default:
                ContentRestrictionBadgeView contentRestrictionBadgeView2 = new ContentRestrictionBadgeView((Context) obj, null, 2, null);
                contentRestrictionBadgeView2.mo2820d(this.f15922b);
                return contentRestrictionBadgeView2;
        }
    }
}
