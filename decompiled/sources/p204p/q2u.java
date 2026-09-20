package p204p;

import android.view.KeyEvent;
import android.widget.TextView;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class q2u implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f184715b;

    public /* synthetic */ q2u(Consumer consumer, int i) {
        this.f184714a = i;
        this.f184715b = consumer;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f184714a) {
            case 0:
                if (i != 5) {
                    return false;
                }
                this.f184715b.accept(v0u.f236129a);
                return true;
            default:
                if (i != 5) {
                    return false;
                }
                this.f184715b.accept(h9n0.f89010a);
                return true;
        }
    }
}
