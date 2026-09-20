package p204p;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.transcript.list.TranscriptListView;

/* JADX INFO: loaded from: classes9.dex */
public final class e9w implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57546a;

    /* JADX INFO: renamed from: b */
    public final int f57547b;

    /* JADX INFO: renamed from: c */
    public final Object f57548c;

    public /* synthetic */ e9w(Object obj, int i, int i2) {
        this.f57546a = i2;
        this.f57548c = obj;
        this.f57547b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57546a) {
            case 0:
                Rect rect = new Rect();
                x28 x28Var = (x28) this.f57548c;
                ((PlayButtonView) x28Var.f257379X).getHitRect(rect);
                int i = rect.top;
                int i2 = this.f57547b;
                rect.top = i - i2;
                rect.left -= i2;
                rect.bottom += i2;
                rect.right += i2;
                ((ConstraintLayout) x28Var.f257383b).setTouchDelegate(new TouchDelegate(rect, (PlayButtonView) x28Var.f257379X));
                break;
            case 1:
                ((loz) this.f57548c).f135581b.onAudioFocusChange(this.f57547b);
                break;
            case 2:
                ((f3d0) this.f57548c).f65479H1.mo1042z0(this.f57547b);
                break;
            case 3:
                p191 scroller = ((TranscriptListView) ((C1778dh) this.f57548c).f48929b).getScroller();
                int height = scroller.f173010a.getHeight();
                LinearLayoutManager linearLayoutManagerM68781a = scroller.m68781a();
                int i3 = this.f57547b;
                View viewMo923D = linearLayoutManagerM68781a != null ? linearLayoutManagerM68781a.mo923D(i3) : null;
                int height2 = viewMo923D != null ? (height / 2) - (viewMo923D.getHeight() / 2) : height / 4;
                LinearLayoutManager linearLayoutManagerM68781a2 = scroller.m68781a();
                if (linearLayoutManagerM68781a2 != null) {
                    linearLayoutManagerM68781a2.mo962x1(i3, height2);
                }
                break;
            case 4:
                ((RecyclerView) this.f57548c).mo1042z0(this.f57547b);
                break;
            case 5:
                ((p3f1) this.f57548c).m69003b(this.f57547b);
                break;
            default:
                ((v9h1) this.f57548c).f238955D.m61014b(this.f57547b);
                break;
        }
    }

    public e9w(v7h1 v7h1Var, v9h1 v9h1Var, int i) {
        this.f57546a = 6;
        this.f57548c = v9h1Var;
        this.f57547b = i;
    }

    public e9w(int i, hj30 hj30Var) {
        this.f57546a = 4;
        this.f57547b = i;
        this.f57548c = hj30Var;
    }
}
