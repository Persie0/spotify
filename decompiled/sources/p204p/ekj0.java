package p204p;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import p196j$.nio.file.Files;
import p196j$.nio.file.LinkOption;
import p196j$.nio.file.Path;
import p196j$.nio.file.Paths;
import p196j$.nio.file.StandardCopyOption;
import p196j$.nio.file.attribute.BasicFileAttributes;
import p196j$.nio.file.attribute.FileTime;

/* JADX INFO: loaded from: classes2.dex */
public final class ekj0 extends hp60 {
    /* JADX INFO: renamed from: o */
    public static Long m39300o(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p204p.hp60, p204p.ywy
    /* JADX INFO: renamed from: c */
    public final void mo39301c(tbn0 tbn0Var, tbn0 tbn0Var2) throws IOException {
        try {
            Files.move(Paths.get(tbn0Var.f218908a.m51759r(), new String[0]), Paths.get(tbn0Var2.f218908a.m51759r(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p204p.hp60, p204p.ywy
    /* JADX INFO: renamed from: h */
    public final jwy mo39302h(tbn0 tbn0Var) throws EOFException {
        tbn0 tbn0VarM31061d;
        Path path = Paths.get(tbn0Var.f218908a.m51759r(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = tbn0.f218907b;
                String string = symbolicLink.toString();
                iva ivaVar = AbstractC1723c.f32631a;
                npa npaVar = new npa();
                npaVar.m65304Q(string);
                tbn0VarM31061d = AbstractC1723c.m31061d(npaVar, false);
            } else {
                tbn0VarM31061d = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM39300o = fileTimeCreationTime != null ? m39300o(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM39300o2 = fileTimeLastModifiedTime != null ? m39300o(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new jwy(zIsRegularFile, zIsDirectory, tbn0VarM31061d, lValueOf, lM39300o, lM39300o2, fileTimeLastAccessTime != null ? m39300o(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p204p.hp60
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
