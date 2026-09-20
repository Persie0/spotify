package p204p;

import android.widget.ImageView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class eak0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fak0 f57694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eak0(fak0 fak0Var, int i) {
        super(0);
        this.f57693a = i;
        this.f57694b = fak0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f57693a) {
            case 0:
                return (ImageView) this.f57694b.f67575d.findViewById(R.id.icon);
            default:
                return (EncoreTextView) this.f57694b.f67575d.findViewById(R.id.title);
        }
    }
}
