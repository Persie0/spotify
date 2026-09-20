package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class tdd extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f219283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f219284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f219285d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f219286e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f219287f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f219288g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f219289h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        super(2);
        this.f219282a = i;
        this.f219283b = z;
        this.f219284c = z2;
        this.f219285d = z3;
        this.f219286e = z4;
        this.f219287f = z5;
        this.f219288g = z6;
        this.f219289h = z7;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f219282a) {
            case 0:
                nzs0 nzs0VarM69985d = phf1.m69985d((sdd) obj2, (rdd) obj, this.f219283b, this.f219284c, this.f219285d, this.f219286e, this.f219287f, this.f219288g, this.f219289h);
                sdd sddVar = nzs0VarM69985d.f160162a;
                mcd mcdVar = nzs0VarM69985d.f160163b;
                return mcdVar != null ? Next.m15607i(sddVar, Collections.singleton(mcdVar)) : Next.m15606h(sddVar);
            default:
                nzs0 nzs0VarM69985d2 = phf1.m69985d((sdd) obj2, (rdd) obj, this.f219283b, this.f219284c, this.f219285d, this.f219286e, this.f219287f, this.f219288g, this.f219289h);
                sdd sddVar2 = nzs0VarM69985d2.f160162a;
                mcd mcdVar2 = nzs0VarM69985d2.f160163b;
                return mcdVar2 != null ? First.m15575c(sddVar2, Collections.singleton(mcdVar2)) : First.m15574b(sddVar2);
        }
    }
}
