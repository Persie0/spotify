package p204p;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class wx6 implements xw10 {

    /* JADX INFO: renamed from: a */
    public final q27 f255942a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f255943b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f255944c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f255945d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f255946e;

    /* JADX INFO: renamed from: f */
    public final c721 f255947f;

    /* JADX INFO: renamed from: g */
    public p27 f255948g;

    /* JADX INFO: renamed from: h */
    public p27 f255949h;

    /* JADX INFO: renamed from: i */
    public boolean f255950i;

    /* JADX INFO: renamed from: j */
    public boolean f255951j;

    /* JADX INFO: renamed from: k */
    public long f255952k;

    /* JADX INFO: renamed from: l */
    public boolean f255953l;

    /* JADX INFO: renamed from: m */
    public boolean f255954m;

    /* JADX INFO: renamed from: n */
    public boolean f255955n;

    public wx6(q27 q27Var, y8t y8tVar, r300 r300Var) throws AudioProcessor$UnhandledAudioFormatException {
        q27 q27Var2 = new q27(r300Var);
        c95.m31844j((q27Var2.f184528c == -1 || q27Var2.f184526a == -1 || q27Var2.f184527b == -1) ? false : true, q27Var2);
        this.f255943b = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            iro iroVar = new iro(2);
            iroVar.f105018d = byteBufferOrder;
            this.f255943b.add(iroVar);
        }
        this.f255944c = new ConcurrentLinkedQueue();
        this.f255945d = new ConcurrentLinkedQueue();
        c721 c721Var = new c721();
        q27 q27Var3 = q27.f184525e;
        c721Var.f34722d = q27Var3;
        c721Var.f34723e = q27Var3;
        c721Var.f34720b = -9223372036854775807L;
        c721Var.f34721c = -9223372036854775807L;
        ByteBuffer byteBuffer = t27.f216437a;
        c721Var.f34724f = byteBuffer;
        c721Var.f34725g = byteBuffer;
        c721Var.f34726h = byteBuffer;
        this.f255947f = c721Var;
        p27 p27Var = new p27(y8tVar.f270381i);
        this.f255948g = p27Var;
        q27 q27VarM68881a = p27Var.m68881a(q27Var2);
        p27 p27Var2 = this.f255948g;
        s27 s27Var = s27.f204911d;
        p27Var2.m68882b(s27Var);
        p27 p27VarM89220b = m89220b(y8tVar, r300Var.f195384m, q27VarM68881a, q27Var, c721Var);
        this.f255949h = p27VarM89220b;
        p27VarM89220b.m68882b(s27Var);
        q27 q27Var4 = this.f255949h.f173266d;
        this.f255942a = q27Var4;
        c95.m31844j(q27Var4.f184528c == 2, q27Var4);
        this.f255946e = new AtomicLong(-9223372036854775807L);
        this.f255952k = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public static p27 m89220b(y8t y8tVar, j6f0 j6f0Var, q27 q27Var, q27 q27Var2, c721 c721Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        jf40 jf40Var = new jf40(4);
        jf40Var.m28985c(c721Var);
        y8tVar.getClass();
        jf40Var.m28987e(y8tVar.f270378f.f157604a);
        int i2 = q27Var2.f184526a;
        int i3 = q27Var2.f184527b;
        if (i2 != -1) {
            xp31 xp31Var = new xp31(false);
            c95.m31843i(i2 == -1 || i2 > 0);
            xp31Var.f264419c = i2;
            jf40Var.m28985c(xp31Var);
        }
        if (i3 == 1 || i3 == 2) {
            qnc qncVar = new qnc();
            SparseArray sparseArray = (SparseArray) qncVar.f190562j;
            rnc rncVarM75999a = rnc.m75999a(1, i3);
            sparseArray.put(rncVarM75999a.f200882a, rncVarM75999a);
            rnc rncVarM75999a2 = rnc.m75999a(2, i3);
            sparseArray.put(rncVarM75999a2.f200882a, rncVarM75999a2);
            jf40Var.m28985c(qncVar);
        }
        p27 p27Var = new p27(jf40Var.m53150g());
        q27 q27VarM68881a = p27Var.m68881a(q27Var);
        if ((i2 == -1 || i2 == q27VarM68881a.f184526a) && ((i3 == -1 || i3 == q27VarM68881a.f184527b) && ((i = q27Var2.f184528c) == -1 || i == q27VarM68881a.f184528c))) {
            return p27Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", q27Var);
    }

    @Override // p204p.bbl0
    /* JADX INFO: renamed from: a */
    public final void mo28642a(y8t y8tVar, long j, r300 r300Var, boolean z) {
        c95.m31855u(!this.f255954m);
        if (r300Var == null) {
            c95.m31856v(j != -9223372036854775807L, "Could not generate silent audio because duration is unknown.");
        } else {
            c95.m31855u(def0.m35794k(r300Var.f195387p));
            q27 q27Var = new q27(r300Var);
            c95.m31856v((q27Var.f184528c == -1 || q27Var.f184526a == -1 || q27Var.f184527b == -1) ? false : true, q27Var);
        }
        this.f255945d.add(new vx6(y8tVar, j, r300Var, z));
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: d */
    public final iro mo28954d() {
        c95.m31855u(!this.f255954m);
        if (this.f255945d.isEmpty()) {
            return (iro) this.f255943b.peek();
        }
        return null;
    }

    @Override // p204p.f0y0
    /* JADX INFO: renamed from: e */
    public final boolean mo28955e() {
        c95.m31855u(!this.f255954m);
        c95.m31855u(this.f255945d.isEmpty());
        iro iroVar = (iro) this.f255943b.remove();
        this.f255944c.add(iroVar);
        this.f255946e.compareAndSet(-9223372036854775807L, iroVar.f105020f);
        Integer.toHexString(hashCode());
        LinkedHashMap linkedHashMap = qpo.f191349a;
        synchronized (qpo.class) {
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m89221j() {
        ByteBuffer byteBufferM89222k;
        ByteBuffer byteBufferM68884d;
        ByteBuffer byteBufferM89223l;
        j6f0 j6f0Var;
        boolean z;
        q27 q27Var;
        c95.m31855u(!this.f255954m);
        if (this.f255950i) {
            if (this.f255948g.m68886f()) {
                p27 p27Var = this.f255948g;
                do {
                    byteBufferM89223l = m89223l();
                    if (!byteBufferM89223l.hasRemaining()) {
                        if (!m89225n()) {
                            break;
                        }
                        p27Var.m68888h();
                        break;
                    }
                    p27Var.m68889i(byteBufferM89223l);
                } while (!byteBufferM89223l.hasRemaining());
            }
            if (this.f255949h.m68886f()) {
                p27 p27Var2 = this.f255949h;
                do {
                    byteBufferM89222k = m89222k();
                    if (!byteBufferM89222k.hasRemaining()) {
                        if (!(this.f255948g.m68886f() ? this.f255948g.m68885e() : m89225n())) {
                            break;
                        }
                        p27Var2.m68888h();
                        break;
                    }
                    p27Var2.m68889i(byteBufferM89222k);
                } while (!byteBufferM89222k.hasRemaining());
                byteBufferM68884d = this.f255949h.m68884d();
            } else {
                byteBufferM68884d = m89222k();
            }
        } else {
            byteBufferM68884d = t27.f216437a;
        }
        if (byteBufferM68884d.hasRemaining()) {
            Integer.toHexString(hashCode());
            byteBufferM68884d.remaining();
            LinkedHashMap linkedHashMap = qpo.f191349a;
            synchronized (qpo.class) {
            }
            return byteBufferM68884d;
        }
        if (!m89224m() && !this.f255945d.isEmpty()) {
            c721 c721Var = this.f255947f;
            q27 q27Var2 = this.f255942a;
            vx6 vx6Var = (vx6) this.f255945d.poll();
            vx6Var.getClass();
            long j = vx6Var.f245623b;
            y8t y8tVar = vx6Var.f245622a;
            this.f255953l = vx6Var.f245625d;
            r300 r300Var = vx6Var.f245624c;
            if (r300Var != null) {
                this.f255952k = j;
                q27Var = new q27(r300Var);
                j6f0Var = r300Var.f195384m;
                z = false;
            } else {
                if (y8tVar.f270378f.f157604a.isEmpty()) {
                    this.f255952k = y8tVar.m93127b(j);
                } else {
                    this.f255952k = j;
                }
                this.f255946e.compareAndSet(-9223372036854775807L, 0L);
                j6f0Var = null;
                z = true;
                q27Var = q27Var2;
            }
            long j2 = this.f255952k;
            c721Var.getClass();
            c95.m31843i(j2 >= 0 || j2 == -9223372036854775807L);
            c721Var.f34721c = j2;
            if (this.f255950i) {
                p27 p27Var3 = new p27(y8tVar.f270381i);
                this.f255948g = p27Var3;
                this.f255949h = m89220b(y8tVar, j6f0Var, p27Var3.m68881a(q27Var), q27Var2, c721Var);
            }
            r27 r27Var = new r27(0);
            r27Var.f195072a = 0L;
            s27 s27VarM74507e = r27Var.m74507e();
            this.f255948g.m68882b(s27VarM74507e);
            this.f255949h.m68882b(s27VarM74507e);
            this.f255951j = false;
            this.f255950i = true;
            if (z) {
                this.f255948g.m68890j();
                this.f255949h.m68888h();
            }
        }
        if (!this.f255955n && m89226o()) {
            Integer.toHexString(hashCode());
            LinkedHashMap linkedHashMap2 = qpo.f191349a;
            synchronized (qpo.class) {
            }
            this.f255955n = true;
        }
        return t27.f216437a;
    }

    /* JADX INFO: renamed from: k */
    public final ByteBuffer m89222k() {
        return this.f255948g.m68886f() ? this.f255948g.m68884d() : m89223l();
    }

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m89223l() {
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f255944c;
            iro iroVar = (iro) concurrentLinkedQueue.peek();
            if (iroVar == null) {
                return t27.f216437a;
            }
            boolean zM67519d = iroVar.m67519d(4);
            this.f255951j = zM67519d;
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f255943b;
            if (zM67519d) {
                iro iroVar2 = (iro) concurrentLinkedQueue.remove();
                iroVar2.mo51465g();
                iroVar2.f105020f = 0L;
                concurrentLinkedQueue2.add(iroVar2);
                return t27.f216437a;
            }
            ByteBuffer byteBuffer = iroVar.f105018d;
            byteBuffer.getClass();
            if (byteBuffer.hasRemaining()) {
                return byteBuffer;
            }
            iro iroVar3 = (iro) concurrentLinkedQueue.remove();
            iroVar3.mo51465g();
            iroVar3.f105020f = 0L;
            concurrentLinkedQueue2.add(iroVar3);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m89224m() {
        if (!this.f255950i) {
            return false;
        }
        if (!this.f255944c.isEmpty()) {
            return true;
        }
        if (!this.f255949h.m68886f() || this.f255949h.m68885e()) {
            return this.f255948g.m68886f() && !this.f255948g.m68885e();
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m89225n() {
        return this.f255951j || !this.f255945d.isEmpty();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m89226o() {
        if (this.f255954m) {
            return true;
        }
        if (!m89224m() && this.f255945d.isEmpty()) {
            return this.f255952k != -9223372036854775807L ? this.f255953l : this.f255951j;
        }
        return false;
    }
}
