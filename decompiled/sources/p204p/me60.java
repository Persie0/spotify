package p204p;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class me60 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue60 f142622b;

    public /* synthetic */ me60(ue60 ue60Var, int i) {
        this.f142621a = i;
        this.f142622b = ue60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142621a) {
            case 0:
                ue60 ue60Var = this.f142622b;
                ReadableByteChannel readableByteChannel = ue60Var.f229427n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    ue60Var.f229427n = null;
                }
                break;
            case 1:
                this.f142622b.f229437x++;
                break;
            case 2:
                ue60 ue60Var2 = this.f142622b;
                se60 se60Var = ue60Var2.f229431r;
                if (se60Var != null) {
                    try {
                        if (se60Var.f208221k != null && se60Var.f208220j.compareAndSet(false, true)) {
                            se60Var.f208221k.close();
                        }
                        break;
                    } catch (IOException unused) {
                    }
                }
                HttpURLConnection httpURLConnection = ue60Var2.f229430q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    ue60Var2.f229430q = null;
                }
                break;
            default:
                ue60 ue60Var3 = this.f142622b;
                ue60Var3.f229418e.add(ue60Var3.f229426m);
                ue60Var3.m82894c(new ke60(ue60Var3, new le60(ue60Var3, 1), 2), "fireOpenConnection");
                break;
        }
    }
}
