package p204p;

import androidx.constraintlayout.widget.Guideline;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: classes5.dex */
public final class cx71 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ex71 f42948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ParagraphView f42949c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Guideline f42950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx71(ex71 ex71Var, ParagraphView paragraphView, Guideline guideline, int i) {
        super(0);
        this.f42947a = i;
        this.f42948b = ex71Var;
        this.f42949c = paragraphView;
        this.f42950d = guideline;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f42947a) {
            case 0:
                return Float.valueOf(ex71.m40193i(this.f42948b, this.f42949c, this.f42950d));
            case 1:
                Guideline guideline = this.f42950d;
                ex71 ex71Var = this.f42948b;
                ParagraphView paragraphView = this.f42949c;
                return Float.valueOf(qvf1.m74014k(30, paragraphView) + ex71.m40193i(ex71Var, paragraphView, guideline));
            default:
                return Float.valueOf(ex71.m40193i(this.f42948b, this.f42949c, this.f42950d));
        }
    }
}
