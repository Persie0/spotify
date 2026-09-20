package p204p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class u3x extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflater f226481b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f226482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3x(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        super(0);
        this.f226480a = i;
        this.f226481b = layoutInflater;
        this.f226482c = viewGroup;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f226480a) {
            case 0:
                return (ViewGroup) this.f226481b.inflate(R.layout.find_tickets_layout, this.f226482c, false);
            case 1:
                return (ViewGroup) this.f226481b.inflate(R.layout.prerelease_album_page, this.f226482c, false);
            default:
                return this.f226481b.inflate(R.layout.fragment_your_episodes_settings, this.f226482c, false);
        }
    }
}
