package p204p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jwy0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f116744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchFragment f116745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwy0(SearchFragment searchFragment, int i) {
        super(1);
        this.f116744a = i;
        this.f116745b = searchFragment;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f116744a) {
            case 0:
                this.f116745b.m3109k1().f279071f = (String) obj;
                break;
            default:
                this.f116745b.m3109k1().f279072g = (List) obj;
                break;
        }
        return w2a1.f247311a;
    }
}
