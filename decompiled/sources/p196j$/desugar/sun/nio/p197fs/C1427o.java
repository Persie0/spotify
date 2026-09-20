package p196j$.desugar.sun.nio.p197fs;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p196j$.nio.file.AbstractC1475h;
import p196j$.nio.file.C1484l0;
import p196j$.nio.file.C1486m0;
import p196j$.nio.file.C1488n0;
import p196j$.nio.file.C1499v;
import p196j$.nio.file.EnumC1432a;
import p196j$.nio.file.InterfaceC1482k0;
import p196j$.nio.file.LinkOption;
import p196j$.nio.file.Path;
import p196j$.util.stream.AbstractC1631f;
import p196j$.util.stream.C1626a;
import p196j$.util.stream.C1627b;
import p196j$.util.stream.C1628c;
import p196j$.util.stream.C1629d;
import p196j$.util.stream.C1630e;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.o */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1427o implements Path {

    /* JADX INFO: renamed from: h */
    public static final Pattern f10495h = Pattern.compile("/+");

    /* JADX INFO: renamed from: a */
    public final AbstractC1475h f10496a;

    /* JADX INFO: renamed from: b */
    public final String f10497b;

    /* JADX INFO: renamed from: c */
    public final List f10498c;

    /* JADX INFO: renamed from: d */
    public final boolean f10499d;

    /* JADX INFO: renamed from: e */
    public final String f10500e;

    /* JADX INFO: renamed from: f */
    public final String f10501f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f10502g;

    public C1427o(AbstractC1475h abstractC1475h, String str, String str2, String str3) {
        this(abstractC1475h, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) Arrays.stream(f10495h.split(str)).filter(new C1426n()).collect(new C1630e(new C1626a(), new C1627b(), new C1628c(), new C1629d(), AbstractC1631f.f10908a)), str2, str3);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: A */
    public final boolean mo23882A(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof C1427o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        if (this.f10498c.size() < nameCount) {
            return false;
        }
        int size = this.f10498c.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C1427o getParent() {
        int size = this.f10498c.size();
        if (size == 0) {
            return null;
        }
        if (size == 1 && !this.f10499d) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f10499d) {
            sb.append("/");
        }
        sb.append(AbstractC1419g.m23829l(this.f10498c.subList(0, size - 1)));
        return new C1427o(this.f10496a, sb.toString(), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: G */
    public final Path mo23885G(Path path) {
        if (!(path instanceof C1427o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.f10499d != ((C1427o) path).f10499d) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = ((C1427o) path).f10498c;
        int size = this.f10498c.size();
        int size2 = list.size();
        int i = 0;
        while (i < size && i < size2 && ((String) this.f10498c.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new C1427o(this.f10496a, false, arrayList, this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final C1427o mo23891s(Path path) {
        if (!(path instanceof C1427o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (((C1427o) path).f10499d) {
            return (C1427o) path;
        }
        return new C1427o(this.f10496a, this.f10497b + "/" + path, this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C1427o mo23883B(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof C1427o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        C1427o parent = getParent();
        return parent == null ? (C1427o) path : parent.mo23891s(path);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final C1427o toAbsolutePath() {
        if (this.f10499d) {
            return this;
        }
        AbstractC1475h abstractC1475h = this.f10496a;
        String str = this.f10500e;
        return new C1427o(abstractC1475h, str, str, this.f10501f).mo23891s(this);
    }

    @Override // p196j$.nio.file.Path
    public final boolean endsWith(String str) {
        return mo23882A(new C1427o(this.f10496a, str, this.f10500e, this.f10501f));
    }

    @Override // p196j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof C1427o) && compareTo((C1427o) obj) == 0;
    }

    @Override // p196j$.nio.file.Path
    public final Path getFileName() {
        if (this.f10498c.isEmpty()) {
            if (this.f10499d) {
                return null;
            }
            return this;
        }
        AbstractC1475h abstractC1475h = this.f10496a;
        List list = this.f10498c;
        return new C1427o(abstractC1475h, (String) list.get(list.size() - 1), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    public final AbstractC1475h getFileSystem() {
        return this.f10496a;
    }

    @Override // p196j$.nio.file.Path
    public final int getNameCount() {
        return this.f10498c.size();
    }

    @Override // p196j$.nio.file.Path
    public final Path getRoot() {
        if (!this.f10499d) {
            return null;
        }
        AbstractC1475h abstractC1475h = this.f10496a;
        String str = this.f10501f;
        return new C1427o(abstractC1475h, str, this.f10500e, str);
    }

    public final int hashCode() {
        return this.f10497b.hashCode();
    }

    @Override // p196j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.f10499d;
    }

    @Override // p196j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C1499v(this);
    }

    @Override // p196j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f10498c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        AbstractC1475h abstractC1475h = this.f10496a;
        boolean z = this.f10499d;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1419g.m23829l(arrayDeque));
        return new C1427o(abstractC1475h, sb.toString(), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: p */
    public final C1486m0 mo23889p(C1488n0 c1488n0, InterfaceC1482k0[] interfaceC1482k0Arr, C1484l0... c1484l0Arr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C1427o getName(int i) {
        if (i < 0 || i >= this.f10498c.size()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C1427o(this.f10496a, (String) this.f10498c.get(i), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return mo23883B(new C1427o(this.f10496a, str, this.f10500e, this.f10501f));
    }

    @Override // p196j$.nio.file.Path
    public final boolean startsWith(String str) {
        return mo23894x(new C1427o(this.f10496a, str, this.f10500e, this.f10501f));
    }

    @Override // p196j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new C1427o(this.f10496a, AbstractC1419g.m23829l(this.f10498c.subList(i, i2)), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: t */
    public final Path mo23892t(LinkOption[] linkOptionArr) {
        this.f10496a.mo23853i().mo23859a(this, EnumC1432a.READ);
        return Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new C1427o(this.f10496a, toFile().getCanonicalPath(), this.f10500e, this.f10501f);
    }

    @Override // p196j$.nio.file.Path
    public final File toFile() {
        return new File(this.f10497b);
    }

    @Override // p196j$.nio.file.Path
    public final String toString() {
        return this.f10497b;
    }

    @Override // p196j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = AbstractC1428p.f10505c;
        C1427o absolutePath = toAbsolutePath();
        if (absolutePath.f10502g == null) {
            absolutePath.f10502g = absolutePath.f10497b.getBytes(AbstractC1429q.f10506a);
        }
        byte[] bArr = absolutePath.f10502g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = AbstractC1428p.f10503a;
            long j2 = AbstractC1428p.f10504b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : (j & (1 << c)) == 0) {
                sb.append('%');
                char[] cArr2 = AbstractC1428p.f10505c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p196j$.nio.file.Path, java.lang.Comparable
    /* JADX INFO: renamed from: v */
    public final int compareTo(Path path) {
        return this.f10497b.compareTo(((C1427o) path).f10497b);
    }

    @Override // p196j$.nio.file.Path
    /* JADX INFO: renamed from: x */
    public final boolean mo23894x(Path path) {
        int nameCount;
        Objects.requireNonNull(path);
        if (!(path instanceof C1427o) || this.f10499d != path.isAbsolute() || this.f10498c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    public C1427o(AbstractC1475h abstractC1475h, boolean z, List list, String str, String str2) {
        this.f10496a = abstractC1475h;
        this.f10499d = z;
        this.f10498c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : "");
        sb.append(AbstractC1419g.m23829l(list));
        this.f10497b = sb.toString();
        this.f10500e = str;
        this.f10501f = str2;
    }
}
