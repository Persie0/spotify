package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final List f7213a;

    /* JADX INFO: renamed from: b */
    public final String f7214b;

    /* JADX INFO: renamed from: c */
    public Throwable f7215c;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class ExceptionOverview extends RuntimeException {
        public ExceptionOverview(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static abstract class PrintStreamOrWriter {
        /* JADX INFO: renamed from: a */
        public abstract PrintStreamOrWriter mo23403a(Serializable serializable);
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class WrappedPrintStream extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintStream f7216a;

        public WrappedPrintStream(PrintStream printStream) {
            this.f7216a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final PrintStreamOrWriter mo23403a(Serializable serializable) {
            this.f7216a.print(serializable);
            return this;
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class WrappedPrintWriter extends PrintStreamOrWriter {

        /* JADX INFO: renamed from: a */
        public final PrintWriter f7217a;

        public WrappedPrintWriter(PrintWriter printWriter) {
            this.f7217a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.PrintStreamOrWriter
        /* JADX INFO: renamed from: a */
        public final PrintStreamOrWriter mo23403a(Serializable serializable) {
            this.f7217a.print(serializable);
            return this;
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* JADX INFO: renamed from: a */
    public static void m23401a(PrintStreamOrWriter printStreamOrWriter, Throwable th, String str) {
        printStreamOrWriter.mo23403a(str).mo23403a(th).mo23403a('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            printStreamOrWriter.mo23403a("\t\tat ").mo23403a(stackTraceElement).mo23403a('\n');
        }
        if (th.getCause() != null) {
            printStreamOrWriter.mo23403a("\tCaused by: ");
            m23401a(printStreamOrWriter, th.getCause(), "");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m23402b(PrintStreamOrWriter printStreamOrWriter) {
        printStreamOrWriter.mo23403a(this).mo23403a("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            printStreamOrWriter.mo23403a("\tat ").mo23403a(stackTraceElement).mo23403a("\n");
        }
        int i = 1;
        for (Throwable th : this.f7213a) {
            printStreamOrWriter.mo23403a("  ComposedException ").mo23403a(Integer.valueOf(i)).mo23403a(" :\n");
            m23401a(printStreamOrWriter, th, "\t");
            i++;
        }
        printStreamOrWriter.mo23403a("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.f7215c == null) {
                String property = System.getProperty("line.separator");
                if (this.f7213a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.f7213a.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable cause : this.f7213a) {
                        int i2 = 0;
                        while (cause != null) {
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(cause.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb.append(message);
                                sb.append(property);
                            } else {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i4 = 0; i4 < i2 + 2; i4++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            }
                            int i5 = 0;
                            while (true) {
                                i = i2 + 2;
                                if (i5 >= i) {
                                    break;
                                }
                                sb.append("  ");
                                i5++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null) {
                                    break;
                                }
                                for (int i6 = 0; i6 < i; i6++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append("(cause not expanded again) ");
                                sb.append(cause2.getClass().getCanonicalName());
                                sb.append(": ");
                                sb.append(cause2.getMessage());
                                sb.append(property);
                                break;
                            }
                            identityHashMap.put(cause, Boolean.TRUE);
                            cause = cause.getCause();
                            i2++;
                        }
                    }
                    this.f7215c = new ExceptionOverview(sb.toString().trim());
                } else {
                    this.f7215c = (Throwable) this.f7213a.get(0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7215c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f7214b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m23402b(new WrappedPrintStream(printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f7213a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f7213a = listUnmodifiableList;
            this.f7214b = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m23402b(new WrappedPrintWriter(printWriter));
    }
}
