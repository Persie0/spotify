package p196j$.nio.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.EnumSet;
import java.util.Objects;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.InterfaceC1440d;
import p196j$.nio.file.attribute.InterfaceC1447k;
import p196j$.nio.file.spi.AbstractC1496c;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class Files {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10511a = 0;

    static {
        AbstractC1419g.m23831n(new Object[]{EnumC1472f0.CREATE_NEW, EnumC1472f0.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m23902a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(copyOption + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().mo23853i().mo23865g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream outputStreamMo23929w = path.getFileSystem().mo23853i().mo23929w(path, EnumC1472f0.CREATE_NEW, EnumC1472f0.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamMo23929w);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamMo23929w);
                }
                if (outputStreamMo23929w != null) {
                    outputStreamMo23929w.close();
                }
            } catch (Throwable th) {
                if (outputStreamMo23929w != null) {
                    try {
                        outputStreamMo23929w.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23903b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            m23904c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (z) {
                m23904c(path).mo23859a(path, new EnumC1432a[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1496c m23904c(Path path) {
        return path.getFileSystem().mo23853i();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        AbstractC1496c abstractC1496cM23904c = m23904c(path);
        if (m23904c(path2).equals(abstractC1496cM23904c)) {
            abstractC1496cM23904c.mo23873o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + copyOption2 + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().mo23853i().mo23865g(path2);
        } else if (m23903b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            path2.getFileSystem().mo23853i().mo23861c(path2, new InterfaceC1447k[0]);
        } else {
            InputStream inputStreamMo23928v = path.getFileSystem().mo23853i().mo23928v(path, new InterfaceC1498u[0]);
            try {
                m23902a(inputStreamMo23928v, path2, new CopyOption[0]);
                inputStreamMo23928v.close();
            } catch (Throwable th) {
                if (inputStreamMo23928v != null) {
                    try {
                        inputStreamMo23928v.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((InterfaceC1440d) path2.getFileSystem().mo23853i().mo23866h(path2, InterfaceC1440d.class, new LinkOption[0])).mo23817a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().mo23853i().mo23864f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().mo23853i().mo23864f(path);
        return path2;
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) m23904c(path).mo23879x(path, cls, linkOptionArr);
    }

    public static Path readSymbolicLink(Path path) {
        return m23904c(path).mo23881z(path);
    }

    public static Path walkFileTree(Path path, FileVisitor<? super Path> fileVisitor) {
        FileVisitResult fileVisitResultVisitFile;
        C1489o c1489o = new C1489o(EnumSet.noneOf(EnumC1490p.class));
        try {
            if (c1489o.f10582e) {
                throw new IllegalStateException("Closed");
            }
            C1485m c1485mM23925c = c1489o.m23925c(path, false);
            do {
                int[] iArr = AbstractC1491q.f10584a;
                EnumC1487n enumC1487n = (EnumC1487n) c1485mM23925c.f10571b;
                BasicFileAttributes basicFileAttributes = (BasicFileAttributes) c1485mM23925c.f10573d;
                Path path2 = (Path) c1485mM23925c.f10572c;
                int i = iArr[enumC1487n.ordinal()];
                if (i == 1) {
                    IOException iOException = (IOException) c1485mM23925c.f10574e;
                    fileVisitResultVisitFile = iOException == null ? fileVisitor.visitFile(path2, basicFileAttributes) : fileVisitor.visitFileFailed(path2, iOException);
                } else if (i == 2) {
                    fileVisitResultVisitFile = fileVisitor.preVisitDirectory(path2, basicFileAttributes);
                    if ((fileVisitResultVisitFile == FileVisitResult.SKIP_SUBTREE || fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) && !c1489o.f10581d.isEmpty()) {
                        try {
                            ((C1483l) c1489o.f10581d.pop()).f10566c.close();
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new AssertionError("Should not get here");
                    }
                    fileVisitResultVisitFile = fileVisitor.postVisitDirectory(path2, (IOException) c1485mM23925c.f10574e);
                    if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS) {
                        fileVisitResultVisitFile = FileVisitResult.CONTINUE;
                    }
                }
                Objects.requireNonNull(fileVisitResultVisitFile);
                if (fileVisitResultVisitFile != FileVisitResult.CONTINUE) {
                    if (fileVisitResultVisitFile == FileVisitResult.TERMINATE) {
                        break;
                    }
                    if (fileVisitResultVisitFile == FileVisitResult.SKIP_SIBLINGS && !c1489o.f10581d.isEmpty()) {
                        ((C1483l) c1489o.f10581d.peek()).f10568e = true;
                    }
                    c1485mM23925c = c1489o.m23924b();
                } else {
                    c1485mM23925c = c1489o.m23924b();
                }
            } while (c1485mM23925c != null);
            c1489o.close();
            return path;
        } catch (Throwable th) {
            try {
                c1489o.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
