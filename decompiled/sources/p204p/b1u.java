package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: classes8.dex */
public final class b1u extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22413a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1u f22414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1u(h1u h1uVar, String str, int i) {
        super(1);
        this.f22413a = i;
        this.f22414b = h1uVar;
        this.f22415c = str;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f22413a;
        String str = this.f22415c;
        h1u h1uVar = this.f22414b;
        switch (i) {
            case 0:
                int i2 = ((m2u) obj).f139463d;
                return i2 == 20 ? Next.m15607i(h1u.m46466c(h1uVar, new w1u(str, i2), false, false, 14), Effects.m15571a(new m0u(str))) : Next.m15606h(h1u.m46466c(h1uVar, new w1u(str, i2), false, false, 14));
            default:
                return Next.m15606h(h1u.m46466c(h1uVar, new z1u(str, ((l2u) obj).f129080d), false, false, 14));
        }
    }
}
