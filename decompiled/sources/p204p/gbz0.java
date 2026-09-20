package p204p;

import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class gbz0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SeeMoreTextView f78442b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbz0(SeeMoreTextView seeMoreTextView, int i) {
        super(0);
        this.f78441a = i;
        this.f78442b = seeMoreTextView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f78441a) {
            case 0:
                return new rie(this.f78442b, abz0.f14208b);
            default:
                return new rie(this.f78442b, abz0.f14207a);
        }
    }
}
