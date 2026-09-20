package p204p;

import androidx.compose.p002ui.graphics.Brush;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lr4 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f136221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f136222c;

    public /* synthetic */ lr4(Object obj, long j, int i) {
        this.f136220a = i;
        this.f136222c = obj;
        this.f136221b = j;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        zld1 zld1Var;
        switch (this.f136220a) {
            case 0:
                return ((ug01) ((Brush) this.f136222c)).mo43315c(this.f136221b);
            case 1:
                yvu0 yvu0Var = (yvu0) this.f136222c;
                long j = this.f136221b;
                synchronized (yvu0Var) {
                    try {
                        if (!yvu0Var.f276771u && (zld1Var = yvu0Var.f276761k) != null) {
                            int i = yvu0Var.f276773w ? yvu0Var.f276772v : -1;
                            yvu0Var.f276772v++;
                            yvu0Var.f276773w = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(yvu0Var.f276753c);
                                sb.append("ms (after ");
                                yvu0.m94746c(yvu0Var, new SocketTimeoutException(klh.m56832d(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    zld1Var.m96362a(9, iva.f106177d);
                                } catch (IOException e) {
                                    yvu0.m94746c(yvu0Var, e, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
            default:
                return new l971((String) this.f136222c, this.f136221b);
        }
    }
}
