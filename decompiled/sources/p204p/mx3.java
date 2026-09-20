package p204p;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: loaded from: classes11.dex */
public final class mx3 extends ExperimentalBidirectionalStream {

    /* JADX INFO: renamed from: a */
    public final BidirectionalStream f147940a;

    /* JADX INFO: renamed from: b */
    public final n94 f147941b;

    /* JADX INFO: renamed from: c */
    public final String f147942c;

    /* JADX INFO: renamed from: d */
    public final Collection f147943d;

    public mx3(BidirectionalStream bidirectionalStream, n94 n94Var, String str, Collection collection) {
        this.f147940a = bidirectionalStream;
        this.f147941b = n94Var;
        this.f147942c = str;
        this.f147943d = collection;
    }

    /* JADX INFO: renamed from: a */
    public final void m63082a(int i, nt4 nt4Var, CronetException cronetException) {
        jo4.m53859a(this.f147941b, this.f147942c, this.f147943d, null, i, nt4Var, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.f147940a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.f147940a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.f147940a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.f147940a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.f147940a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.f147940a.write(byteBuffer, z);
    }
}
