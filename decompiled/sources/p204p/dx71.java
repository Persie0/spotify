package p204p;

import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: classes5.dex */
public final class dx71 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ParagraphView f53869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx71(ParagraphView paragraphView, int i) {
        super(1);
        this.f53868a = i;
        this.f53869b = paragraphView;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f53868a) {
            case 0:
                this.f53869b.setTranslationY(((Number) obj).floatValue());
                break;
            default:
                this.f53869b.setTranslationY(((Number) obj).floatValue());
                break;
        }
        return w2a1.f247311a;
    }
}
