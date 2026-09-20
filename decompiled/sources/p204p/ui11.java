package p204p;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ui11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi11 f230567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui11(vi11 vi11Var, int i) {
        super(0);
        this.f230566a = i;
        this.f230567b = vi11Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f230566a) {
            case 0:
                return (List) this.f230567b.f241596h.mo33098e();
            case 1:
                return (RecyclerView) mec1.m61562n(this.f230567b.f241588X, R.id.shortcuts_grid);
            default:
                return (FrameLayout) mec1.m61562n(this.f230567b.f241588X, R.id.heading_container);
        }
    }
}
