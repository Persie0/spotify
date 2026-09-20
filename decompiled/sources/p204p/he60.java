package p204p;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.Channels;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class he60 implements ve60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ je60 f90334b;

    public /* synthetic */ he60(je60 je60Var, int i) {
        this.f90333a = i;
        this.f90334b = je60Var;
    }

    @Override // p204p.ve60
    /* JADX INFO: renamed from: run */
    public final void mo98370run() throws IOException {
        switch (this.f90333a) {
            case 0:
                je60 je60Var = this.f90334b;
                se60 se60Var = (se60) je60Var;
                if (se60Var.f208221k == null) {
                    se60Var.f208223m.f229425l = 10;
                    se60Var.f208219i.setDoOutput(true);
                    se60Var.f208219i.connect();
                    se60Var.f208223m.f229425l = 12;
                    OutputStream outputStream = se60Var.f208219i.getOutputStream();
                    se60Var.f208222l = outputStream;
                    se60Var.f208221k = Channels.newChannel(outputStream);
                }
                je60Var.f111469a.set(0);
                je60Var.m53082b(new he60(je60Var, 1), "readFromProvider");
                break;
            default:
                je60 je60Var2 = this.f90334b;
                je60Var2.f111472d.read(je60Var2, je60Var2.f111473e);
                je60Var2.f111471c.execute(new ig10(je60Var2, 5));
                break;
        }
    }
}
