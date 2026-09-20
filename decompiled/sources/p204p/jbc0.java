package p204p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class jbc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f110731a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kbc0 f110732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbc0(kbc0 kbc0Var, int i) {
        super(0);
        this.f110731a = i;
        this.f110732b = kbc0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f110731a) {
            case 0:
                nvu0 nvu0Var = this.f110732b.f121175a;
                x2b x2bVar = nvu0Var.f158964c;
                if (x2bVar != null) {
                    try {
                        x2bVar.m89729a();
                    } catch (IOException unused) {
                        Logger.m3966b("Could not clear cache, %s", nvu0Var.f158962a.getAbsolutePath());
                    }
                }
                break;
            default:
                this.f110732b.f121176b.clearCache();
                break;
        }
        return w2a1.f247311a;
    }
}
