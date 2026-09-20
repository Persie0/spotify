package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import com.spotify.transcript.commons.views.ElementContainer;

/* JADX INFO: loaded from: classes10.dex */
public final class lpu0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135844a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q58 f135845b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpu0(q58 q58Var, int i) {
        super(0);
        this.f135844a = i;
        this.f135845b = q58Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f135844a) {
            case 0:
                return (ElementContainer) ((View) this.f135845b.f185456b).findViewById(R.id.cancel_element);
            default:
                return (RecyclerView) ((View) this.f135845b.f185456b).findViewById(R.id.report_options_recycler_view);
        }
    }
}
