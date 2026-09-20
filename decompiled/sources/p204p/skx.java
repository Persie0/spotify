package p204p;

import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class skx implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f210214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f210215c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f210216d;

    public /* synthetic */ skx(View view, Object obj, Object obj2, int i) {
        this.f210213a = i;
        this.f210214b = view;
        this.f210215c = obj;
        this.f210216d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f210213a) {
            case 0:
                CharSequence charSequence = (CharSequence) this.f210215c;
                SpannableString spannableString = (SpannableString) this.f210216d;
                tkx tkxVar = (tkx) this.f210214b;
                if (tkxVar.getMeasuredWidth() != 0) {
                    tkxVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = (tkxVar.getMeasuredWidth() - tkxVar.getPaddingLeft()) - tkxVar.getPaddingRight();
                    CharSequence charSequence2 = (CharSequence) this.f210215c;
                    TextPaint paint = tkxVar.getPaint();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout(charSequence2, paint, measuredWidth, alignment, 1.0f, 0.0f, false);
                    if (staticLayout.getLineCount() > 2) {
                        CharSequence charSequenceM88491o1 = wl51.m88491o1(charSequence.subSequence(0, staticLayout.getLineEnd(1)));
                        if (new StaticLayout(charSequenceM88491o1, tkxVar.getPaint(), measuredWidth, alignment, 1.0f, 0.0f, false).getLineCount() != 1) {
                            int i = 0;
                            do {
                                int iM88462L0 = wl51.m88462L0(charSequenceM88491o1, ' ', 0, 6);
                                if (iM88462L0 != -1) {
                                    int length = charSequenceM88491o1.length() - iM88462L0;
                                    charSequenceM88491o1 = charSequenceM88491o1.subSequence(0, iM88462L0);
                                    if (length < spannableString.length()) {
                                        i += length;
                                    }
                                }
                                tkxVar.setText(charSequenceM88491o1);
                                tkxVar.append(spannableString);
                                break;
                            } while (i < spannableString.length());
                            tkxVar.setText(charSequenceM88491o1);
                            tkxVar.append(spannableString);
                        } else {
                            tkxVar.setText(charSequenceM88491o1);
                            tkxVar.append("\n");
                            tkxVar.append(spannableString);
                        }
                    } else {
                        tkxVar.setText(charSequence);
                    }
                    break;
                }
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f210214b;
                AbstractC0110a layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null || layoutManager.m1097I() != 0) {
                    j430 j430Var = (j430) this.f210215c;
                    j430Var.m52322a(recyclerView, this.f210216d, j430Var.f108577i, false);
                    recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                ParagraphView paragraphView = (ParagraphView) this.f210216d;
                mh90 mh90Var = (mh90) this.f210215c;
                ParagraphView paragraphView2 = (ParagraphView) this.f210214b;
                paragraphView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int lineCount = paragraphView2.getLineCount();
                if (lineCount != 1) {
                    if (lineCount == 2) {
                        mh90.m61742i(mh90Var, paragraphView2, mh90Var.f143738i, R.style.TextAppearance_Encore_TitleMedium);
                        mh90.m61742i(mh90Var, paragraphView, mh90Var.f143739j, R.style.TextAppearance_Encore_TitleMedium);
                    } else {
                        mh90.m61742i(mh90Var, paragraphView2, mh90Var.f143738i, R.style.TextAppearance_Encore_TitleSmall);
                        mh90.m61742i(mh90Var, paragraphView, mh90Var.f143739j, R.style.TextAppearance_Encore_TitleSmall);
                    }
                }
                break;
        }
    }
}
