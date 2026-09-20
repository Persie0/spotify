package p204p;

import java.util.concurrent.atomic.AtomicLong;
import p196j$.nio.file.FileVisitResult;
import p196j$.nio.file.SimpleFileVisitor;
import p196j$.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes3.dex */
public final class hwy extends SimpleFileVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicLong f96073a;

    public hwy(AtomicLong atomicLong) {
        this.f96073a = atomicLong;
    }

    @Override // p196j$.nio.file.SimpleFileVisitor, p196j$.nio.file.FileVisitor
    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        this.f96073a.addAndGet(basicFileAttributes.size());
        return FileVisitResult.CONTINUE;
    }
}
