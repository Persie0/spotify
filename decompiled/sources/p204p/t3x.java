package p204p;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class t3x extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9t f216852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3x(z9t z9tVar, int i) {
        super(0);
        this.f216851a = i;
        this.f216852b = z9tVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f216851a) {
            case 0:
                return mec1.m61562n((ViewGroup) ((wg61) this.f216852b.f280873b).getValue(), R.id.handle);
            case 1:
                return (RecyclerView) mec1.m61562n((ViewGroup) ((wg61) this.f216852b.f280873b).getValue(), R.id.find_tickets_recycler);
            default:
                return (TextView) mec1.m61562n((ViewGroup) ((wg61) this.f216852b.f280873b).getValue(), R.id.title);
        }
    }
}
