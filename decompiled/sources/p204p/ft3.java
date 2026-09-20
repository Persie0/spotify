package p204p;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ft3 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73098a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht3 f73099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft3(ht3 ht3Var, int i) {
        super(0);
        this.f73098a = i;
        this.f73099b = ht3Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f73098a) {
            case 0:
                return (RecyclerView) mec1.m61562n((View) this.f73099b.f94913e, R.id.anchors_grid);
            default:
                return (FrameLayout) mec1.m61562n((View) this.f73099b.f94913e, R.id.heading_container);
        }
    }
}
