package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class t6c extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarouselFragment f217532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6c(CarouselFragment carouselFragment, int i) {
        super(2);
        this.f217531a = i;
        this.f217532b = carouselFragment;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f217531a) {
            case 0:
                this.f217532b.m3096h1().m15621f(new e6c((String) obj, ((Number) obj2).intValue()));
                break;
            case 1:
                this.f217532b.m3096h1().m15621f(new f6c(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
            case 2:
                this.f217532b.m3096h1().m15621f(new e6c((String) obj, ((Number) obj2).intValue()));
                break;
            default:
                this.f217532b.m3096h1().m15621f(new f6c(((Number) obj).intValue(), ((Number) obj2).intValue()));
                break;
        }
        return w2a1.f247311a;
    }
}
