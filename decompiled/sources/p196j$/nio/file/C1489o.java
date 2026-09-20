package p196j$.nio.file;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import p196j$.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: renamed from: j$.nio.file.o */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1489o implements Closeable {

    /* JADX INFO: renamed from: a */
    public final boolean f10578a;

    /* JADX INFO: renamed from: b */
    public final LinkOption[] f10579b;

    /* JADX INFO: renamed from: c */
    public final int f10580c;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f10581d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public boolean f10582e;

    public C1489o(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (AbstractC1481k.f10563a[((EnumC1490p) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        this.f10578a = z;
        this.f10579b = z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        this.f10580c = Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: a */
    public final BasicFileAttributes m23923a(Path path) throws IOException {
        try {
            return Files.readAttributes(path, BasicFileAttributes.class, this.f10579b);
        } catch (IOException e) {
            if (this.f10578a) {
                return Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1485m m23924b() {
        Path path;
        IOException cause;
        C1485m c1485mM23925c;
        C1483l c1483l = (C1483l) this.f10581d.peek();
        if (c1483l == null) {
            return null;
        }
        do {
            if (c1483l.f10568e) {
                path = null;
                cause = null;
            } else {
                Iterator it = c1483l.f10567d;
                try {
                    path = it.hasNext() ? (Path) it.next() : null;
                    cause = null;
                } catch (DirectoryIteratorException e) {
                    cause = e.getCause();
                    path = null;
                }
            }
            if (path == null) {
                try {
                    c1483l.f10566c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                this.f10581d.pop();
                return new C1485m(EnumC1487n.END_DIRECTORY, c1483l.f10564a, (BasicFileAttributes) null, cause);
            }
            c1485mM23925c = m23925c(path, true);
        } while (c1485mM23925c == null);
        return c1485mM23925c;
    }

    /* JADX INFO: renamed from: c */
    public final C1485m m23925c(Path path, boolean z) {
        try {
            BasicFileAttributes basicFileAttributesM23923a = m23923a(path);
            if (this.f10581d.size() >= this.f10580c || !basicFileAttributesM23923a.isDirectory()) {
                return new C1485m(EnumC1487n.ENTRY, path, basicFileAttributesM23923a, (IOException) null);
            }
            if (this.f10578a) {
                Object objFileKey = basicFileAttributesM23923a.fileKey();
                for (C1483l c1483l : this.f10581d) {
                    Object obj = c1483l.f10565b;
                    if (objFileKey == null || obj == null) {
                        try {
                            if (Files.m23904c(path).mo23872n(path, c1483l.f10564a)) {
                                return new C1485m(EnumC1487n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                            }
                        } catch (IOException | SecurityException unused) {
                            continue;
                        }
                    } else if (objFileKey.equals(obj)) {
                        return new C1485m(EnumC1487n.ENTRY, path, (BasicFileAttributes) null, new FileSystemLoopException(path.toString()));
                    }
                }
            }
            try {
                this.f10581d.push(new C1483l(path, basicFileAttributesM23923a.fileKey(), Files.m23904c(path).mo23876r(path, C1492r.f10585a)));
                return new C1485m(EnumC1487n.START_DIRECTORY, path, basicFileAttributesM23923a, (IOException) null);
            } catch (IOException e) {
                return new C1485m(EnumC1487n.ENTRY, path, (BasicFileAttributes) null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new C1485m(EnumC1487n.ENTRY, path, (BasicFileAttributes) null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10582e) {
            return;
        }
        while (!this.f10581d.isEmpty()) {
            if (!this.f10581d.isEmpty()) {
                try {
                    ((C1483l) this.f10581d.pop()).f10566c.close();
                } catch (IOException unused) {
                }
            }
        }
        this.f10582e = true;
    }
}
