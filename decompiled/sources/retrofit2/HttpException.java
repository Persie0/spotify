package retrofit2;

import java.util.Objects;
import p204p.n2x0;
import p204p.o2x0;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f288164a;

    /* JADX INFO: renamed from: b */
    public final String f288165b;

    /* JADX INFO: renamed from: c */
    public final transient o2x0 f288166c;

    public HttpException(o2x0 o2x0Var) {
        Objects.requireNonNull(o2x0Var, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        n2x0 n2x0Var = o2x0Var.f161171a;
        sb.append(n2x0Var.f149860d);
        sb.append(" ");
        sb.append(n2x0Var.f149859c);
        super(sb.toString());
        this.f288164a = n2x0Var.f149860d;
        this.f288165b = n2x0Var.f149859c;
        this.f288166c = o2x0Var;
    }
}
